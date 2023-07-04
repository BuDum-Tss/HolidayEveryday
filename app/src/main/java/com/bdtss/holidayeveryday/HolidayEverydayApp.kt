package com.bdtss.holidayeveryday

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.bdtss.holidayeveryday.presentation.CountryViewModel
import com.bdtss.holidayeveryday.screen.HomeScreen

@Composable
fun BooksApp(
    modifier: Modifier = Modifier
) {
    val countryViewModel: CountryViewModel =
        viewModel(factory = CountryViewModel.Factory)
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            TopAppBar (
                title = {
                    Text(text = "Holiday Everyday")
                }
            )
        }
    ) {
        Surface(modifier = modifier
            .fillMaxSize()
            .padding(it),
            color = MaterialTheme.colors.background
        ) {
            HomeScreen(
                countryState = countryViewModel.countryState,
                retryAction = { countryViewModel.getCountries()},
                modifier = modifier
            )
        }
    }
}