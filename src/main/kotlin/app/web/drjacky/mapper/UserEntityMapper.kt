package app.web.drjacky.mapper

import app.web.drjacky.data.UserEntity
import app.web.drjacky.model.User
import org.springframework.stereotype.Component

@Component
class UserEntityMapper : EntityMapper<UserEntity, User> {
    override fun toModel(entity: UserEntity) =
        User(
            membershipId = entity.membershipId,
            firstName = entity.firstName,
            lastName = entity.lastName,
            creationTime = entity.creationTime
        )

    override fun toEntity(model: User) =
        UserEntity(
            membershipId = model.membershipId,
            firstName = model.firstName,
            lastName = model.lastName,
            creationTime = model.creationTime
        )

}