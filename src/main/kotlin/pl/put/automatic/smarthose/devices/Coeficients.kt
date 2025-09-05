package pl.put.automatic.smarthose.devices

import java.math.BigDecimal

class Coeficients(
    val acTemp: BigDecimal = BigDecimal.valueOf(-0.5),
    val heaterTemp: BigDecimal = BigDecimal.valueOf(0.2),
    val humidifierHum: BigDecimal = BigDecimal.valueOf(1.0),
    val dehumidifierHum: BigDecimal = BigDecimal.valueOf(-1.2),
    val ledLightLux: BigDecimal = BigDecimal.valueOf(150.0),
    val sunlightLux: BigDecimal = BigDecimal.valueOf(200.0),
    val ventilationCarbonDioxide: BigDecimal = BigDecimal.valueOf(-50.0),
    val ventilationTemp: BigDecimal = BigDecimal.valueOf(-0.2)
)