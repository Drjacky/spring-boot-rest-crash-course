package app.web.drjacky.data

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.io.Serializable

@Entity
class UserEntity(
    var membershipId: Int = 0,
    @Id var firstName: String = "",
    var lastName: String = "",
    var creationTime: String? = null
) : Serializable

// A no-arg constructor is required by JPA, which is why we provide default values for the properties.
// Using 'var' is also recommended so the JPA provider can set the properties after instantiation.