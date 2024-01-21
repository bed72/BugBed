package com.bed.bugbed.infrastructure.di

import org.koin.dsl.module

import com.bed.bugbed.domain.usecases.GetAllPokemonsUseCase

import com.bed.bugbed.data.usecases.RemoteGetAllPokemonUseCase

val useCaseModule = module {
    single<GetAllPokemonsUseCase> {
        RemoteGetAllPokemonUseCase(get())
    }
}