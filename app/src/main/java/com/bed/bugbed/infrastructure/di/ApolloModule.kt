package com.bed.bugbed.infrastructure.di

import org.koin.dsl.module

import com.apollographql.apollo3.ApolloClient

import com.bed.bugbed.BuildConfig

val apolloModule = module {
    single {
        ApolloClient.Builder()
            .serverUrl(BuildConfig.BASE_URL)
            .build()
    }
}