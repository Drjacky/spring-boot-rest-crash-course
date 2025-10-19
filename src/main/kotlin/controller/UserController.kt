package app.web.drjacky.controller

import app.web.drjacky.model.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    private val userMap = HashMap<String, User>().also {
        it["drjacky"] = User(1, "Dr", "Jacky")
        it["blah"] = User(2, "Bl", "a")
    }

    @GetMapping("/getUser")
    fun getUser() = "Drjacky"

    @GetMapping("/getUserByModel")
    fun getUserByModel() = User(1, "Dr", "Jacky")

    @GetMapping("/getUserByUserName/{userName}")
    fun getUserByUserName(@PathVariable userName: String) = userMap.get(userName)

}