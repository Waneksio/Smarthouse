package pl.put.automatic.smarthose.exception

class NoSuchDeviceException(val deviceName: String) :
    RuntimeException("Device $deviceName not found") {
}