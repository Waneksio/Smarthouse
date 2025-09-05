package pl.put.automatic.smarthose.simulation

import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/simulation")
class SimulationController(val simulationService: SimulationService) {

    @PatchMapping("start")
    fun start() {
        simulationService.start()
    }

    @PatchMapping("stop")
    fun stop() {
        simulationService.stop()
    }
}