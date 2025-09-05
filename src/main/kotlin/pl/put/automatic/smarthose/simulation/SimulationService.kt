package pl.put.automatic.smarthose.simulation

import org.springframework.scheduling.annotation.Async
import pl.put.automatic.smarthose.enviromentvariables.EnvironmentVariables

interface SimulationService {

    @Async
    fun start()

    @Async
    fun stop()

    fun getEnvironment(): EnvironmentVariables
}