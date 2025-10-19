package app.web.drjacky.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties
data class TimeApiResponse(val utcDateTime: String)