package com.foodie.presentation.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import com.foodie.presentation.component.RecipeItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecipeScreen() {

    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Foodie")
                },
            )
        }
    ) {
        LazyColumn(modifier = Modifier.padding(it)) {
            item {
                RecipeItem()
            }
        }
    }
}

@Composable
fun RecipeScreenPreview() {
    RecipeScreen()
}