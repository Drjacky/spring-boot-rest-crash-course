package app.web.drjacky.data

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : CrudRepository<UserEntity, String> {

    fun findByFirstName(firstName: String): UserEntity

    fun deleteByFirstName(firstName: String)

}