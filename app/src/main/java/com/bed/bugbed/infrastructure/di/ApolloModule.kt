package com.bed.bugbed.infrastructure.di

import com.apollographql.apollo3.ApolloClient
import com.bed.bugbed.BuildConfig
import org.koin.dsl.module

val apolloModule = module {
    single {
        ApolloClient.Builder()
            .serverUrl(BuildConfig.BASE_URL)
            .build()
    }
}