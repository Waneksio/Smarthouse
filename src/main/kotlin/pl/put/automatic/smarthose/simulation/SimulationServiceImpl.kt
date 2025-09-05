package pl.put.automatic.smarthose.simulation

import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Service
import pl.put.automatic.smarthose.enviromentvariables.EnvironmentVariables
import pl.put.automatic.smarthose.exception.SimulationAlreadyRunningException
import pl.put.automatic.smarthose.devices.Coeficients
import pl.put.automatic.smarthose.devices.Devices
import java.math.BigDecimal

@Service
class SimulationServiceImpl : SimulationService {
    var running = false
    var environmentVariables: EnvironmentVariables = EnvironmentVariables(
        BigDecimal.valueOf(22.0),
        BigDecimal.valueOf(50.0),
        BigDecimal.valueOf(400),
        BigDecimal.valueOf(1500)
    )
    val coeficients = Coeficients()

    @Async
    override fun start() {
        if (running) {
            throw SimulationAlreadyRunningException()
        }
        running = true
        simulate()
    }

    @Async
    override fun stop() {
        running = false
    }

    fun simulate() {
        while (running) {
            val updatedEnvironment = updateEnvironment()
            environmentVariables = updatedEnvironment
            Thread.sleep(1000)
        }
    }

    override fun getEnvironment(): EnvironmentVariables {
        return environmentVariables
    }

    fun updateEnvironment(): EnvironmentVariables {
        val devices = Devices.INSTANCE

        val newTemperature = environmentVariables.temperature +
                coeficients.acTemp * devices.getAc() +
                coeficients.heaterTemp * devices.getHeater() +
                coeficients.ventilationTemp * devices.getVentilation()

        val newHumidity = environmentVariables.humidity +
                coeficients.humidifierHum * devices.getHumidifier() +
                coeficients.dehumidifierHum * devices.getDehumidifier()

        val newLight = environmentVariables.lightness +
                coeficients.ledLightLux * devices.getLed() +
                coeficients.sunlightLux * (BigDecimal.ONE.minus(devices.getBlinds()))

        val newCarbonDioxide = environmentVariables.carbonDioxide +
                coeficients.ventilationCarbonDioxide * devices.getVentilation()

        newTemperature.setScale(2)
        newHumidity.setScale(2)
        newLight.setScale(2)
        newCarbonDioxide.setScale(2)

        return EnvironmentVariables(newTemperature, newHumidity, newLight, newCarbonDioxide)
    }
}