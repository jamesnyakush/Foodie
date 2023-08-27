package com.foodie.domain.repository

import com.foodie.domain.model.RecipeResponse
import kotlinx.coroutines.flow.Flow

interface RecipeRepository {

    suspend fun getRecipeList(): Flow<RecipeResponse>
}