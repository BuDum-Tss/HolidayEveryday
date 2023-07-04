package com.bdtss.holidayeveryday.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.bdtss.holidayeveryday.domain.entity.Country

@Composable
fun CountryGridScreen(
    countries: List<Country>,
    modifier: Modifier
) {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(150.dp),
        contentPadding = PaddingValues(4.dp)
    ) {
        itemsIndexed(countries) { _, country ->
            CountryCard(country = country, modifier)
        }
    }
}

@Composable
fun CountryCard(
    country: Country,
    modifier: Modifier
) {
    Card(
        modifier = modifier
            .padding(4.dp)
            .fillMaxWidth()
            .requiredHeight(36.dp),
        elevation = 8.dp
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = country.name,
                textAlign = TextAlign.Center,
                modifier = modifier
                    .padding(top = 4.dp, bottom = 8.dp)
            )
        }
    }
}