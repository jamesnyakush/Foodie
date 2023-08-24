package com.foodie.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.foodie.presentation.screen.RecipeDetailScreen
import com.foodie.presentation.screen.RecipeScreen

@Composable
fun SetupNavGraph(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.RecipeScreen.route
    ) {
        composable(route = Screen.RecipeScreen.route) {
            RecipeScreen()
        }

        composable(route = Screen.RecipeDetail.route) {
            RecipeDetailScreen()
        }
    }

}