package pl.put.automatic.smarthose.devices

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/devices",  produces = ["application/json"])
class DevicesController(private val devicesService: DevicesService) {

    @GetMapping("/{deviceName}")
    fun getDevice(@PathVariable deviceName: String): DeviceDto {
        return devicesService.getDevice(deviceName)
    }

    @PatchMapping("/{deviceName}")
    fun updateDevice(@PathVariable deviceName: String, @RequestBody payload: DevicePatchPayload) {
        devicesService.updateDevice(deviceName, payload.newDeviceState)
    }
}