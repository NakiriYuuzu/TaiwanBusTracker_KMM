package net.yuuzu.taiwanbustrack_kmm

import androidx.compose.runtime.Composable
import moe.tlaster.precompose.PreComposeApplication
import moe.tlaster.precompose.navigation.Navigator
import platform.UIKit.UIScreen
import platform.UIKit.UIUserInterfaceStyle
import platform.UIKit.UIViewController

@Composable
internal fun MainView(navigator: Navigator) {
    val isDarkTheme = UIScreen.mainScreen.traitCollection.userInterfaceStyle ==
            UIUserInterfaceStyle.UIUserInterfaceStyleDark

    App(
        darkTheme = isDarkTheme,
        dynamicColor = false,
        navigator = navigator
    )
}

@Suppress("FunctionName")
fun MainViewController(): UIViewController {
    val navigator = Navigator()

//    initKoin {
//        modules(appModule)
//    }

    return PreComposeApplication {
        MainView(navigator)
    }
}