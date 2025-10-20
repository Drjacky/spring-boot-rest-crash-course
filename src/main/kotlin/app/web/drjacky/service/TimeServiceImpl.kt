package app.web.drjacky.service

import app.web.drjacky.config.TimeApiConfig
import app.web.drjacky.model.TimeApiResponse
import kong.unirest.Unirest
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class TimeServiceImpl(private val timeApiConfig: TimeApiConfig) : TimeService {
    @Value("\${x-rapidapi-key}")
    private val rapidApiKey: String? = null

    override fun getCurrentTime(area: String): String {
        val result = Unirest.get(timeApiConfig.endpoint + timeApiConfig.continent + "/" + area)
            .header("x-rapidapi-key", rapidApiKey)
            .header("x-rapidapi-host", "world-time-api3.p.rapidapi.com")
            .asObject(TimeApiResponse::class.java).body

        println("result: " + result)
        println("rapidApiKey: " + rapidApiKey)
        println("result.utc_datetime: " + result.utc_datetime)
        return result.utc_datetime
    }
}