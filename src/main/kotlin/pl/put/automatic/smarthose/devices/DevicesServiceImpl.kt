package pl.put.automatic.smarthose.devices

import org.springframework.stereotype.Service
import pl.put.automatic.smarthose.exception.NoSuchDeviceException

@Service
class DevicesServiceImpl : DevicesService {

    override fun updateDevice(deviceName: String, newState: String) {
        val newStateValue = newState.toBigDecimal()
        when (deviceName) {
            "ac" -> Devices.INSTANCE.setAc(newStateValue)
            "heater" -> Devices.INSTANCE.setHeater(newStateValue)
            "humidifier" -> Devices.INSTANCE.setHumidifier(newStateValue)
            "dehumidifier" -> Devices.INSTANCE.setDehumidifier(newStateValue)
            "led" -> Devices.INSTANCE.setLed(newStateValue)
            "ventilation" -> Devices.INSTANCE.setVentilation(newStateValue)
            "blinds" -> Devices.INSTANCE.setBlinds(newStateValue)
        }
    }

    override fun getDevice(deviceName: String): DeviceDto {
        val deviceState = when (deviceName) {
            "ac" -> Devices.INSTANCE.getAc()
            "heater" -> Devices.INSTANCE.getHeater()
            "humidifier" -> Devices.INSTANCE.getHumidifier()
            "dehumidifier" -> Devices.INSTANCE.getDehumidifier()
            "led" -> Devices.INSTANCE.getLed()
            "blinds" -> Devices.INSTANCE.getBlinds()
            else -> throw NoSuchDeviceException(deviceName)
        }
        return DeviceDto(deviceName, deviceState)
    }
}