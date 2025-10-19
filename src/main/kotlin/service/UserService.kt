package app.web.drjacky.service

import app.web.drjacky.model.User
import org.springframework.stereotype.Service
import kotlin.collections.set

@Service
class UserService {

    private val userMap = HashMap<String, User>().also {
        it["drjacky"] = User(1, "Dr", "Jacky")
        it["blah"] = User(2, "Bl", "a")
    }

    fun getUser(userName: String) = userMap.get(userName)

    fun addUser(user: User) = userMap.put(user.firstName, user)

    fun deleteUser(userName: String) = userMap.remove(userName)

}