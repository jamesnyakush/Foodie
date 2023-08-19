package com.foodie.domain.model

data class UserRatings(
    val count_negative: Int,
    val count_positive: Int,
    val score: Double
)