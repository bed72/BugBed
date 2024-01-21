package com.bed.bugbed.data.usecases

import java.lang.Exception

import com.bed.bugbed.data.models.DataModel
import com.bed.bugbed.data.apollo.ApolloClient

import com.bed.bugbed.domain.functional.Either
import com.bed.bugbed.domain.usecases.GetAllPokemonsUseCase

class RemoteGetAllPokemonUseCase(
    private val httpClient: ApolloClient
) : GetAllPokemonsUseCase {
    override suspend fun getAllPokemons(): Either<Exception, DataModel> =
        httpClient.getAllPokemons()
}