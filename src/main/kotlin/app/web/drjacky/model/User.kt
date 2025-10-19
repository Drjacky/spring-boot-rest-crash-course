package app.web.drjacky.model

data class User(
    val membershipId: Int,
    val firstName: String,
    val lastName: String,
    val creationTime: String? = null
)