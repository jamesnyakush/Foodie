package com.foodie.presentation.navigation

sealed class Screen(val route: String) {
    object RecipeScreen : Screen(route = "recipe_screen")
    object RecipeDetail : Screen(route = "recipe_detail")
}