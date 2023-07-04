package com.bdtss.holidayeveryday.data

import com.bdtss.holidayeveryday.domain.entity.Holiday
import com.bdtss.holidayeveryday.domain.repository.HolidayRepository


class HolidayRepositoryImpl : HolidayRepository, RepositoryImpl() {

    private val loanApi by lazy {
        retrofit.create(HolidaysApi::class.java)
    }

    override suspend fun getAll(countryCode: String): List<Holiday> = loanApi.getAll(countryCode)
}