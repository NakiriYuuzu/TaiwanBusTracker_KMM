package net.yuuzu.taiwanbustrack_kmm

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import moe.tlaster.precompose.navigation.Navigator
import net.yuuzu.taiwanbustrack_kmm.common.navigation.Navigation
import net.yuuzu.taiwanbustrack_kmm.common.theme.AppTheme

@Composable
fun App(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    navigator: Navigator
) {
    AppTheme(
        darkTheme = darkTheme,
        dynamicColor = dynamicColor
    ) {
        Surface(
            color = MaterialTheme.colorScheme.background,
            modifier = Modifier.fillMaxSize()
        ) {
            Navigation(navigator)
        }
    }
}