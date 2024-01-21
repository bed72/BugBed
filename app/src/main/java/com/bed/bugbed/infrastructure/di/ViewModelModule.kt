package com.bed.bugbed.infrastructure.di

import org.koin.dsl.module

import org.koin.androidx.viewmodel.dsl.viewModel

import com.bed.bugbed.presentation.PokemonViewModel

val viewModelModule = module {
    viewModel {
        PokemonViewModel(get())
    }
}