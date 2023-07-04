package com.bdtss.holidayeveryday.presentation

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.bdtss.holidayeveryday.MainActivity
import kotlinx.coroutines.launch
import retrofit2.HttpException
import java.io.IOException
import androidx.compose.runtime.*
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import com.bdtss.holidayeveryday.HolidayEverydayApplication
import com.bdtss.holidayeveryday.domain.repository.CountryRepository

class CountryViewModel(
    private val countryRepository: CountryRepository
) : ViewModel() {

    var countryState: CountryState by mutableStateOf(CountryState.Loading)
        private set

    init {
        getCountries()
    }

    fun getCountries() {
        viewModelScope.launch {
            countryState = CountryState.Loading
            countryState =
                try {
                    CountryState.Content(countryRepository.getAll())
                } catch (e: IOException) {
                    CountryState.Error
                } catch (e: HttpException) {
                    CountryState.Error
                }
        }
    }

    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application = (this[APPLICATION_KEY] as HolidayEverydayApplication)
                val countryRepository = application.container.countryRepository
                CountryViewModel(countryRepository = countryRepository)
            }
        }
    }
}
