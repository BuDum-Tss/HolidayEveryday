package com.bdtss.holidayeveryday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.bdtss.holidayeveryday.data.AppContainerImpl
import com.bdtss.holidayeveryday.domain.AppContainer
import com.bdtss.holidayeveryday.ui.theme.HolidayEverydayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HolidayEverydayTheme{
                BooksApp()
            }
        }
    }
}