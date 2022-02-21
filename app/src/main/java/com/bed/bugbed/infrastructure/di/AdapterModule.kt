package com.bed.bugbed.infrastructure.di

import com.bed.bugbed.data.apollo.ApolloClient
import com.bed.bugbed.infrastructure.apollo.ApolloAdapter
import org.koin.dsl.module

val adapterModule = module {
    single<ApolloClient> {
        ApolloAdapter(get())
    }
}