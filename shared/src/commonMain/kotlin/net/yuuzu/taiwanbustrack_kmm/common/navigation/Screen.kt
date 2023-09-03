package net.yuuzu.taiwanbustrack_kmm.common.navigation

import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(
    val route: String,
    val title: String? = null,
    val navIcon: ImageVector? = null,
    val objectName: String? = null,
    val objectPath: String? = null
) {
    data object MainScreen : Screen(
        route = "main_screen",
        title = "Main"
    )
}