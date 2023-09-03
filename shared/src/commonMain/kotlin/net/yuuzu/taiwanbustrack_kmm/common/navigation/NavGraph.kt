package net.yuuzu.taiwanbustrack_kmm.common.navigation

import androidx.compose.runtime.Composable
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.Navigator
import net.yuuzu.taiwanbustrack_kmm.presentation.MainScreen

@Composable
fun Navigation(navigator: Navigator) {
    NavHost(
        navigator = navigator,
        initialRoute = Screen.MainScreen.route,
    ) {
        scene(route = Screen.MainScreen.route) {
            MainScreen(navigator)
        }
    }
}