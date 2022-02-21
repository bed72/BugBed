package com.bed.bugbed.infrastructure.di

import com.bed.bugbed.presentation.PokemonViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        PokemonViewModel(get())
    }
}