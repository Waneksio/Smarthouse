package pl.put.automatic.smarthose.devices

import jakarta.validation.constraints.NotNull

data class DevicePatchPayload(
    @NotNull
    val newDeviceState: String
)
