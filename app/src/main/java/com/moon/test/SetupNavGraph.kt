package com.moon.test

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
    startDestination = Screen.Splash.route){
        composable(
            route = Screen.Splash.route
        ){
            SplashScreen(navController)
        }
        composable(
            route = Screen.Test.route
        ){
            TestScreen()
        }
        composable(
            route = Screen.Web.route
        ){
            WebScreen()
        }
    }
}