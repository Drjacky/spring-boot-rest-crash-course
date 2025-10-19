package app.web.drjacky.controller

import app.web.drjacky.model.User
import app.web.drjacky.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(private val userService: UserService) {

    @GetMapping("/getUser")
    fun getUser() = "Drjacky"

    @GetMapping("/getUserByModel")
    fun getUserByModel() = User(1, "Dr", "Jacky")

    @GetMapping("/getUserByUserName/{userName}")
    fun getUserByUserName(@PathVariable userName: String) = userService.getUser(userName)

    @GetMapping("/getUserByUserNameV2/{userName}")
    fun getUserByUserNameV2(@PathVariable userName: String): ResponseEntity<User>? {
        return userService.getUser(userName)?.let { user ->
            ResponseEntity.ok(user)
        } ?: ResponseEntity.notFound().build()

    }

    @PostMapping("/addUser")
    fun addUser(@RequestBody user: User): ResponseEntity<HttpStatus> {
        userService.addUser(user)
        return ResponseEntity.accepted().build()
    }

    @DeleteMapping("/deleteUser/{userName}")
    fun deleteUser(@RequestBody userName: String): ResponseEntity<HttpStatus> {
        userService.deleteUser(userName)
        return ResponseEntity.noContent().build()
    }

}