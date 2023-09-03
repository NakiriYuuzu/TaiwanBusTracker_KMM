package net.yuuzu.network.model

import io.ktor.http.ContentType

data class ApiRequest<T>(
    val method: ApiMethod,
    val url: String,
    val path: String,
    val requestHeader: Map<String, String> = emptyMap(),
    val requestBody: Any? = null,
    val contentType: ContentType = ContentType.Application.Json,
    val parameters: List<ApiQuery> = emptyList()
)