package com.bed.bugbed.domain.usecases

import java.lang.Exception

import com.bed.bugbed.data.models.DataModel
import com.bed.bugbed.domain.functional.Either

interface GetAllPokemonsUseCase {
    suspend fun getAllPokemons(): Either<Exception, DataModel>
}