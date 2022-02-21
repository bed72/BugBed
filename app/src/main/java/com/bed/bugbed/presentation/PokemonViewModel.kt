package com.bed.bugbed.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bed.bugbed.GetAllPokemonsQuery
import com.bed.bugbed.data.models.DataModel
import com.bed.bugbed.domain.usecases.GetAllPokemonsUseCase
import kotlinx.coroutines.launch
import timber.log.Timber
import java.lang.Exception

class PokemonViewModel(
    private val pokemonsUseCase: GetAllPokemonsUseCase
) : ViewModel() {

    init {
        getAllPokemons()
    }

    private val _pokemonsLiveData = MutableLiveData<List<GetAllPokemonsQuery.Result?>>()
    val pokemonsLiveData: LiveData<List<GetAllPokemonsQuery.Result?>> get() = _pokemonsLiveData

    private fun getAllPokemons() = viewModelScope.launch {
        val response = pokemonsUseCase.getAllPokemons()

        response.fold(
            ::handleException,
            ::handlePokemons
        )
    }

    private fun handlePokemons(data: DataModel) {
        _pokemonsLiveData.value = data.data?.results ?: listOf()
    }

    private fun handleException(exception: Exception) {
        Timber.tag("ERROR: $exception")
    }
}