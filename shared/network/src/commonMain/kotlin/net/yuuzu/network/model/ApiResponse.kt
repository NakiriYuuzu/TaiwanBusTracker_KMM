package net.yuuzu.network.model

import io.ktor.client.statement.HttpResponse

data class Response<T>(
    val response: HttpResponse
)