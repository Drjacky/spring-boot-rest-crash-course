package app.web.drjacky

import app.web.drjacky.config.TimeApiConfig
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(TimeApiConfig::class)
class MainApplication

fun main(args: Array<String>) {
//    SpringApplication.run(MainApplication::class.java, *args)
    runApplication<MainApplication>(*args)
}
