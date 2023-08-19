package com.foodie.domain.model

data class RecipeResponse(
    val count: Int,
    val results: List<Result>
)