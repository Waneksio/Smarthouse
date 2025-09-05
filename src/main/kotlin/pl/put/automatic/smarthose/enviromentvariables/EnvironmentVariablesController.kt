package pl.put.automatic.smarthose.enviromentvariables

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/enviroment-variables"], produces = ["application/json"])
class EnvironmentVariablesController(private val environmentVariablesService: EnvironmentVariablesService) {

    @GetMapping
    fun getEnvironmentVariables(): EnvironmentVariablesDto {
        return environmentVariablesService.getEnvironmentVariables()
    }
}