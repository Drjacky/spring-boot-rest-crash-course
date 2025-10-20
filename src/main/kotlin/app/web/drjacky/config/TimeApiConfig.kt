package app.web.drjacky.config

import org.springframework.boot.context.properties.ConfigurationProperties


@ConfigurationProperties(prefix = "api")
data class TimeApiConfig(
    val endpoint: String,
    val continent: String
)