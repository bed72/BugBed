package com.bed.bugbed.infrastructure.di

import com.bed.bugbed.data.usecases.RemoteGetAllPokemonUseCase
import com.bed.bugbed.domain.usecases.GetAllPokemonsUseCase
import org.koin.dsl.module

val useCaseModule = module {
    single<GetAllPokemonsUseCase> {
        RemoteGetAllPokemonUseCase(get())
    }
}