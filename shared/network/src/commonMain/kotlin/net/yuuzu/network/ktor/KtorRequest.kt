package net.yuuzu.network.ktor

import io.ktor.client.HttpClient
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.headers
import io.ktor.client.request.request
import io.ktor.client.request.setBody
import io.ktor.http.HttpMethod
import io.ktor.http.contentType
import io.ktor.http.takeFrom
import net.yuuzu.network.model.Api
import net.yuuzu.network.model.ApiMethod
import net.yuuzu.network.model.ApiRequest
import net.yuuzu.network.model.Response

class KtorRequest(
    private val client: HttpClient
) : Api {

    override suspend fun <T>request(request: ApiRequest<T>): Response<T> {
        val response = client.request {
            method(request.method)
            url(request.url, request.path)

            if (request.requestHeader.isNotEmpty()) {
                request.requestHeader.forEach {
                    headers.append(it.key, it.value)
                }
            }

            if (request.requestBody != null) {
                contentType(request.contentType)
                setBody(request.requestBody)
            }

            if (request.parameters.isNotEmpty()) {
                request.parameters.forEach {
                    url.parameters.append(it.key, it.value)
                }
            }
        }
        return Response(response)
    }

    private fun HttpRequestBuilder.method(originalMethod: ApiMethod) {
        method = when (originalMethod) {
            ApiMethod.GET -> HttpMethod.Get
            ApiMethod.POST -> HttpMethod.Post
            ApiMethod.PUT -> HttpMethod.Put
            ApiMethod.DELETE -> HttpMethod.Delete
        }
    }

    private fun HttpRequestBuilder.url(newUrl: String, path: String) = url {
        takeFrom(newUrl + path)
    }
}