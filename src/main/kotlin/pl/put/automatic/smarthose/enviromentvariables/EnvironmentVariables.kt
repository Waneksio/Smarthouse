package pl.put.automatic.smarthose.enviromentvariables

import java.math.BigDecimal

data class EnvironmentVariables(
    val temperature: BigDecimal,
    val humidity: BigDecimal,
    val lightness: BigDecimal,
    val carbonDioxide: BigDecimal
)
