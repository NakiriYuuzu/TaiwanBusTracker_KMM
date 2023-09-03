package net.yuuzu.network.model

interface Api {
    suspend fun <T>request(request: ApiRequest<T>): Response<T>
}