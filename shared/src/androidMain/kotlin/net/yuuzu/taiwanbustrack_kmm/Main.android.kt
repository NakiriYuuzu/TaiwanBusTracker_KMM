package net.yuuzu.taiwanbustrack_kmm

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import moe.tlaster.precompose.navigation.Navigator

@Composable
fun MainView(navigator: Navigator) {
    App(
        darkTheme = isSystemInDarkTheme(),
        dynamicColor = false,
        navigator = navigator
    )
}