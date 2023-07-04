package com.bdtss.holidayeveryday

import android.app.Application
import com.bdtss.holidayeveryday.data.AppContainerImpl
import com.bdtss.holidayeveryday.domain.AppContainer

class HolidayEverydayApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = AppContainerImpl()
    }
}