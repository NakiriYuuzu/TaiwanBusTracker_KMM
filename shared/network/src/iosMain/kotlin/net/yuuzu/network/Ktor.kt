package net.yuuzu.network

import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.darwin.Darwin

actual fun getEngine(): HttpClientEngine = Darwin.create()