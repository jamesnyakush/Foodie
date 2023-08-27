package com.foodie.data.repository

import com.foodie.data.ApiClient
import com.foodie.domain.model.RecipeResponse
import com.foodie.domain.repository.RecipeRepository
import kotlinx.coroutines.flow.Flow

class RecipeRepositoryImpl constructor(
    private val apiClient: ApiClient
) {
   // : RecipeRepository
//    override suspend fun getRecipeList(): Flow<RecipeResponse> {
//        return apiClient.getRecipe(
//    }


}