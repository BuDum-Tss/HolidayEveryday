package com.bdtss.holidayeveryday.presentation

import com.bdtss.holidayeveryday.domain.entity.Holiday

sealed interface HolidayState {
    object Loading : HolidayState
    data class Content(val holiday: List<Holiday>) : HolidayState
    object Error : HolidayState
}