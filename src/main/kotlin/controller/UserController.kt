package app.web.drjacky.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    @GetMapping("/getUser")
    fun getUser() = "Drjacky"

}