package app.web.drjacky.service

import app.web.drjacky.model.TimeApiResponse
import kong.unirest.Unirest
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class TimeServiceImpl : TimeService {
    @Value("\${x-rapidapi-key}")
    private val rapidApiKey: String? = null

    override fun getCurrentTime(area: String): String {
        val result = Unirest.get("https://world-time-api3.p.rapidapi.com/timezone/Europe/$area")
            .header("x-rapidapi-key", rapidApiKey)
            .header("x-rapidapi-host", "world-time-api3.p.rapidapi.com")
            .asObject(TimeApiResponse::class.java).body

        println("result: " + result)
        println("rapidApiKey: " + rapidApiKey)
        println("result.utc_datetime: " + result.utc_datetime)
        return result.utc_datetime
    }
}