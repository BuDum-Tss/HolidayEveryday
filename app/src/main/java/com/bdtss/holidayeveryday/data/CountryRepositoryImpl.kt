package com.bdtss.holidayeveryday.data

import com.bdtss.holidayeveryday.domain.entity.Country
import com.bdtss.holidayeveryday.domain.repository.CountryRepository
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class CountryRepositoryImpl : CountryRepository, RepositoryImpl() {

    private val loanApi by lazy {
        retrofit.create(CountriesApi::class.java)
    }

    override suspend fun getAll(): List<Country> = loanApi.getAll()
}