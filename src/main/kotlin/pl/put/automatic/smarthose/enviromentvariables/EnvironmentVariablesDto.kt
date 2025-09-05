package pl.put.automatic.smarthose.enviromentvariables

import java.math.BigDecimal

data class EnvironmentVariablesDto(
    val temperature: BigDecimal,
    val humidity: BigDecimal,
    val lightness: BigDecimal,
    val carbonDioxide: BigDecimal
)

fun EnvironmentVariables.toDto() = EnvironmentVariablesDto(
    temperature,
    humidity,
    lightness,
    carbonDioxide
)
