package app.web.drjacky.service

import app.web.drjacky.model.User
import org.springframework.stereotype.Service
import kotlin.collections.set

@Service
class UserServiceImpl(private val timeService: TimeService) : UserService {

    private val userMap = HashMap<String, User>().also {
        it["drjacky"] = User(1, "Dr", "Jacky")
        it["blah"] = User(2, "Bl", "a")
    }

    override fun getUser(userName: String) = userMap.get(userName)

    override fun addUser(user: User): User? {
        val tempUser = user.copy(creationTime = timeService.getCurrentTime("UTC"))
        return userMap.put(tempUser.firstName, tempUser)
    }

    override fun deleteUser(userName: String) = userMap.remove(userName)

}