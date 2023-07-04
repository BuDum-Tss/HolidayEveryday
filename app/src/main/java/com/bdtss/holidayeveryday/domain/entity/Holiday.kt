package com.bdtss.holidayeveryday.domain.entity

data class Holiday(
    val date: String,
    val localName: String,
    val name: String,
    val countryCode: String,
    val fixed: Boolean,
    val global: Boolean,
    val counties: List<Country>?,
    val launchYear: Int?,
    val types: List<HolidayType>
)