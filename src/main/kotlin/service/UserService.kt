package app.web.drjacky.service

import app.web.drjacky.model.User

interface UserService {
    fun getUser(userName: String): User?
    fun addUser(user: User): User?
    fun deleteUser(userName: String): User?
}