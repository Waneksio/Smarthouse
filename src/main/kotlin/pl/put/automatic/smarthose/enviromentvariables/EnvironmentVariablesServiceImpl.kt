package pl.put.automatic.smarthose.enviromentvariables

import org.springframework.stereotype.Service
import pl.put.automatic.smarthose.simulation.SimulationService

@Service
class EnvironmentVariablesServiceImpl(private val simulationService: SimulationService) : EnvironmentVariablesService {

    override fun getEnvironmentVariables(): EnvironmentVariablesDto {
        return simulationService.getEnvironment().toDto()
    }
}