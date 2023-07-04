package com.bdtss.holidayeveryday.presentation

import com.bdtss.holidayeveryday.domain.entity.Country

sealed interface CountryState {
    object Loading : CountryState
    data class Content(val countries: List<Country>) : CountryState
    object Error : CountryState
}