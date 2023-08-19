package com.foodie.domain.model

data class Tag(
    val display_name: String,
    val id: Int,
    val name: String,
    val root_tag_type: String,
    val type: String
)