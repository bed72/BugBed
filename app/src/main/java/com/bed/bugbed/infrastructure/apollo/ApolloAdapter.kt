package com.bed.bugbed.infrastructure.apollo

import com.apollographql.apollo3.ApolloClient

import com.bed.bugbed.GetAllPokemonsQuery

import com.bed.bugbed.domain.functional.Either

import com.bed.bugbed.data.models.DataModel
import com.bed.bugbed.data.apollo.ApolloClient as CustomApolloClient

class ApolloAdapter(
    private val apolloClient: ApolloClient
) : CustomApolloClient {
    override suspend fun getAllPokemons(): Either<Exception, DataModel> =
        try {
            val response = apolloClient.query(GetAllPokemonsQuery(limit = 10, offset = 1)).execute()

            Either.Right(DataModel(response.data?.pokemons))
        } catch (exception: Exception) {
            Either.Left(exception)
        }
}