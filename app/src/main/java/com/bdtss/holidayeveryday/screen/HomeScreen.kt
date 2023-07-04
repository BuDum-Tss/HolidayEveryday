package com.bdtss.holidayeveryday.screen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.bdtss.holidayeveryday.presentation.CountryState

@Composable
fun HomeScreen(
    countryState: CountryState,
    retryAction: () -> Unit,
    modifier: Modifier
) {
    when (countryState) {
        is CountryState.Loading -> LoadingScreen(modifier)
        is CountryState.Content -> CountryGridScreen(
            countries = countryState.countries,
            modifier = modifier
        )
        is CountryState.Error -> ErrorScreen(retryAction = retryAction, modifier)
    }
}