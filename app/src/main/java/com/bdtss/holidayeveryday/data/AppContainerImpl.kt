package com.bdtss.holidayeveryday.data

import com.bdtss.holidayeveryday.domain.AppContainer
import com.bdtss.holidayeveryday.domain.repository.CountryRepository
import com.bdtss.holidayeveryday.domain.repository.HolidayRepository

class AppContainerImpl() : AppContainer {
    override val countryRepository: CountryRepository by lazy {
        CountryRepositoryImpl()
    }
    override val holidayRepository: HolidayRepository by lazy {
        HolidayRepositoryImpl()
    }
}