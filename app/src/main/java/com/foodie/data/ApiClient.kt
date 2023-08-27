package com.foodie.data

import com.foodie.domain.model.RecipeResponse
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.HeaderMap
import retrofit2.http.Headers

interface ApiClient {

//    @Headers("X-RapidAPI-Key: ","X-RapidAPI-Host")

//    @Header({
//        "X-RapidAPI-Key: Bar",
//        "X-RapidAPI-Host: Pong"
//    })
    @GET("recipes/list")
    suspend fun getRecipe(): RecipeResponse
}