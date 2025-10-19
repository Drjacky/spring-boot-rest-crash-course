package app.web.drjacky.controller

import app.web.drjacky.model.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    @GetMapping("/getUser")
    fun getUser() = "Drjacky"

    @GetMapping("/getUserByModel")
    fun getUserByModel() = User(1, "Dr", "Jacky")

}