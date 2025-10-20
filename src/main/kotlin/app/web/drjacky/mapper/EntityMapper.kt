package app.web.drjacky.mapper

interface EntityMapper<T, U> {
    fun toModel(entity: T): U
    fun toEntity(model: U): T
}