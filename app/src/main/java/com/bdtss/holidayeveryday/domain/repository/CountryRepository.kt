package com.bdtss.holidayeveryday.domain.repository

import com.bdtss.holidayeveryday.domain.entity.Country

interface CountryRepository {
    suspend fun getAll(): List<Country>
}