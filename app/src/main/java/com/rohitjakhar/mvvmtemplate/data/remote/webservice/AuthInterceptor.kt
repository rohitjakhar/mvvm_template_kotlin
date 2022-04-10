package com.rohitjakhar.mvvmtemplate.data.remote.webservice

import okhttp3.Interceptor
import okhttp3.Response

class AuthInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val response = chain.request()
        val authRequest = response.newBuilder()
            .build()
        return chain.proceed(authRequest)
    }
}
