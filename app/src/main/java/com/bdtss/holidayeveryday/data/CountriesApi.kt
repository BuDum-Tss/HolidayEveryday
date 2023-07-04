package com.bdtss.holidayeveryday.data

import com.bdtss.holidayeveryday.domain.entity.Country
import retrofit2.http.GET

interface CountriesApi {
    @GET("/api/v3/AvailableCountries")
    suspend fun getAll(): List<Country>
}