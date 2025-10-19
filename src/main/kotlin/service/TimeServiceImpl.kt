package app.web.drjacky.service

import kong.unirest.Unirest
import model.TimeApiResponse

class TimeServiceImpl : TimeService {
    override fun getCurrentTime(area: String): String {
        val result = Unirest.get("http://worldtimeapi.org/api/timezone/$area")
            .asObject(TimeApiResponse::class.java).body

        return result.utcDateTime
    }
}