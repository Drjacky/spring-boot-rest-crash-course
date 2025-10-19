package app.web.drjacky

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MainApplication

fun main(args: Array<String>) {
//    SpringApplication.run(MainApplication::class.java, *args)
    runApplication<MainApplication>(*args)
}
