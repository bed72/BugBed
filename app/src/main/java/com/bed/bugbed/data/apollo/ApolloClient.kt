package com.bed.bugbed.data.apollo

import com.bed.bugbed.data.models.DataModel

import com.bed.bugbed.domain.functional.Either

interface ApolloClient {
    suspend fun getAllPokemons(): Either<Exception, DataModel>
}