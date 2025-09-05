package pl.put.automatic.smarthose.devices

import java.math.BigDecimal

enum class Devices(
    private var ac: BigDecimal,
    private var heater: BigDecimal,
    private var humidifier: BigDecimal,
    private var dehumidifier: BigDecimal,
    private var led: BigDecimal,
    private var ventilation: BigDecimal,
    private var blinds: BigDecimal
) {
    INSTANCE(BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO);

    fun getAc(): BigDecimal {
        return this.ac
    }

    fun setAc(ac: BigDecimal) {
        this.ac = ac
    }

    fun getHeater(): BigDecimal {
        return heater
    }

    fun setHeater(heater: BigDecimal) {
        this.heater = heater
    }

    fun getHumidifier(): BigDecimal {
        return humidifier
    }

    fun setHumidifier(humidifier: BigDecimal) {
        this.humidifier = humidifier
    }

    fun getDehumidifier(): BigDecimal {
        return dehumidifier
    }

    fun setDehumidifier(dehumidifier: BigDecimal) {
        this.dehumidifier = dehumidifier
    }

    fun getLed(): BigDecimal {
        return led
    }

    fun setLed(led: BigDecimal) {
        this.led = led
    }

    fun getVentilation(): BigDecimal {
        return ventilation
    }

    fun setVentilation(ventilation: BigDecimal) {
        this.ventilation = ventilation
    }

    fun getBlinds(): BigDecimal {
        return blinds
    }

    fun setBlinds(blinds: BigDecimal) {
        this.blinds = blinds
    }
}