package com.foodie.domain.model

data class Nutrition(
    val calories: Int,
    val carbohydrates: Int,
    val fat: Int,
    val fiber: Int,
    val protein: Int,
    val sugar: Int,
    val updated_at: String
)