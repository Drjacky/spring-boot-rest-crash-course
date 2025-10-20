package app.web.drjacky.service

import app.web.drjacky.data.UserEntity
import app.web.drjacky.data.UserRepository
import app.web.drjacky.mapper.EntityMapper
import app.web.drjacky.model.User
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(
    private val timeService: TimeService,
    private val userRepository: UserRepository,
    private val entityMapper: EntityMapper<UserEntity, User>
) : UserService {

    override fun getUser(userName: String) =
        entityMapper.toModel(userRepository.findByFirstName(userName))

    override fun addUser(user: User) {
        val tempUser = user.copy(creationTime = timeService.getCurrentTime("Dublin"))
        userRepository.save(entityMapper.toEntity(tempUser))
    }

    override fun deleteUser(userName: String) = userRepository.deleteByFirstName(userName)

}