package pl.put.automatic.smarthose

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableAsync

@SpringBootApplication
@EnableAsync
class SmarthoseApplication

fun main(args: Array<String>) {
    runApplication<SmarthoseApplication>(*args)
}
