package com.bed.bugbed

import android.app.Application

import org.koin.core.logger.Level
import org.koin.core.context.startKoin

import org.koin.android.ext.koin.androidLogger
import org.koin.android.ext.koin.androidContext

import com.bed.bugbed.infrastructure.di.apolloModule
import com.bed.bugbed.infrastructure.di.adapterModule
import com.bed.bugbed.infrastructure.di.useCaseModule
import com.bed.bugbed.infrastructure.di.viewModelModule

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            androidLogger(Level.DEBUG)

            modules(
                apolloModule,
                adapterModule,
                useCaseModule,
                viewModelModule,
            )
        }
    }
}