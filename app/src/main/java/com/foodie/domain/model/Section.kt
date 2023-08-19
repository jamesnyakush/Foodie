package com.foodie.domain.model

data class Section(
    val components: List<Component>,
    val name: String,
    val position: Int
)