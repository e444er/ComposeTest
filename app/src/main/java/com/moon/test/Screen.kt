package com.moon.test

sealed class Screen(val route: String) {
    object Splash:Screen(route = "splash")
    object Test:Screen(route = "test")
    object Web:Screen(route = "web")
}
