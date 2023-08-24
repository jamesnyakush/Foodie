package com.foodie.data

import com.foodie.domain.model.RecipeResponse
import retrofit2.http.GET

interface ApiClient {

    @GET("")
    suspend fun getRecipe(): RecipeResponse
}