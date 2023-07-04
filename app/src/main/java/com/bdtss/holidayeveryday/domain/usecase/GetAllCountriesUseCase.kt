package com.bdtss.holidayeveryday.domain.usecase

import com.bdtss.holidayeveryday.domain.entity.Country
import com.bdtss.holidayeveryday.domain.repository.CountryRepository

class GetAllCountriesUseCase(
    private val repository: CountryRepository
) {
    suspend operator fun invoke(): List<Country> = repository.getAll()
}