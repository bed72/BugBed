package com.bed.bugbed.domain.usecases

import com.bed.bugbed.data.models.DataModel
import com.bed.bugbed.domain.functional.Either
import java.lang.Exception

interface GetAllPokemonsUseCase {
    suspend fun getAllPokemons(): Either<Exception, DataModel>
}