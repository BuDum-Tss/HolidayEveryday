package com.bdtss.holidayeveryday.domain.repository

import com.bdtss.holidayeveryday.domain.entity.Holiday

interface HolidayRepository {
    suspend fun getAll(countryCode: String): List<Holiday>
}