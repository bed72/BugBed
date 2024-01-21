package com.bed.bugbed.infrastructure.di

import org.koin.dsl.module

import com.bed.bugbed.data.apollo.ApolloClient

import com.bed.bugbed.infrastructure.apollo.ApolloAdapter

val adapterModule = module {
    single<ApolloClient> {
        ApolloAdapter(get())
    }
}