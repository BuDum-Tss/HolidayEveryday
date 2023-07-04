package com.bdtss.holidayeveryday.data

import com.bdtss.holidayeveryday.domain.entity.Country
import com.bdtss.holidayeveryday.domain.entity.Holiday
import retrofit2.http.GET

interface HolidaysApi {
    @GET("/api/v3/PublicHolidays/2023/{countryCode}") // TODO: изменить год
    suspend fun getAll(countryCode: String): List<Holiday>
}