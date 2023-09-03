package net.yuuzu.network

import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.android.Android

actual fun getEngine(): HttpClientEngine = Android.create()