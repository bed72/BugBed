package com.bed.bugbed

import android.app.Application
import com.bed.bugbed.infrastructure.di.*
import org.koin.android.BuildConfig
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            androidLogger(if (BuildConfig.DEBUG) Level.ERROR else Level.NONE)

            modules(
                apolloModule,
                adapterModule,
                useCaseModule,
                viewModelModule,
            )
        }
    }
}