package net.yuuzu.taiwanbustrack_kmm.android

import android.os.Bundle

import moe.tlaster.precompose.lifecycle.PreComposeActivity
import moe.tlaster.precompose.lifecycle.setContent
import moe.tlaster.precompose.navigation.Navigator
import net.yuuzu.taiwanbustrack_kmm.MainView

class MainActivity : PreComposeActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val navigator = Navigator()
        setContent {
            MainView(navigator)
        }
    }
}