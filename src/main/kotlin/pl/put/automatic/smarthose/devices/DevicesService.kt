package pl.put.automatic.smarthose.devices

import org.springframework.stereotype.Service

interface DevicesService {

    fun updateDevice(deviceName: String, newState: String)

    fun getDevice(deviceName: String): DeviceDto
}