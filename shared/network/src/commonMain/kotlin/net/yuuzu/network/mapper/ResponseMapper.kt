package net.yuuzu.network.mapper

import io.ktor.client.call.body
import io.ktor.client.statement.bodyAsText
import io.ktor.http.isSuccess
import net.yuuzu.network.exception.AuthException
import net.yuuzu.network.exception.CodeException
import net.yuuzu.network.exception.ServerException
import net.yuuzu.network.model.Response

class ResponseMapper {
    suspend inline fun <reified T> map(httpResponse: Response<T>): Result<T> {
        return try {
            if (httpResponse.response.status.isSuccess()) {
                Result.success(httpResponse.response.body())
            } else if (httpResponse.response.status.value == 401) {
                Result.failure(AuthException(error = httpResponse.response.status.description))
            } else {
                Result.failure(ServerException(error = httpResponse.response.bodyAsText()))
            }
        } catch (e: Exception) {
            Result.failure(CodeException(error = e.message ?: "Unknown Error"))
        }
    }
}

inline fun <R, T : R> Result<T>.guard(onFailure: (failure: Throwable) -> R): R {
    return getOrElse {
        onFailure(it)
    }
}