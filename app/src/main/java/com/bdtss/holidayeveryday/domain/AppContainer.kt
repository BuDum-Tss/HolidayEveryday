package com.bdtss.holidayeveryday.domain

import com.bdtss.holidayeveryday.domain.repository.CountryRepository
import com.bdtss.holidayeveryday.domain.repository.HolidayRepository

interface AppContainer {
    val countryRepository: CountryRepository
    val holidayRepository: HolidayRepository
}