package com.example.trabajo__android.Navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import com.example.trabajo__android.screen.LazyContent
import com.example.trabajo__android.screen.PaginacionScreen

@Composable
fun NavComponent() {
    val navegationController = rememberNavController()
    NavHost(navController = navegationController, startDestination="View_1"){
        composable( route = "View_1"){
            PaginacionScreen(navegationController)
        }
        composable( route = "View_3"){
            LazyContent(navegationController)
        }

    }
}

