package com.bdtss.holidayeveryday.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.bdtss.holidayeveryday.HolidayEverydayApplication
import com.bdtss.holidayeveryday.MainActivity
import com.bdtss.holidayeveryday.domain.repository.HolidayRepository
import kotlinx.coroutines.launch
import retrofit2.HttpException
import java.io.IOException

class HolidayViewModel(
    private val holidayRepository: HolidayRepository
) : ViewModel() {

    var holidayState: HolidayState by mutableStateOf(HolidayState.Loading)
        private set

    init {
        getHolidays("RU")// TODO: переделать 
    }

    fun getHolidays(countryCode: String) {
        viewModelScope.launch {
            holidayState = HolidayState.Loading
            holidayState =
                try {
                    HolidayState.Content(holidayRepository.getAll(countryCode))
                } catch (e: IOException) {
                    HolidayState.Error
                } catch (e: HttpException) {
                    HolidayState.Error
                }
        }
    }

    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application =
                    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as HolidayEverydayApplication)
                val holidayRepository = application.container.holidayRepository
                HolidayViewModel(holidayRepository = holidayRepository)
            }
        }
    }
}