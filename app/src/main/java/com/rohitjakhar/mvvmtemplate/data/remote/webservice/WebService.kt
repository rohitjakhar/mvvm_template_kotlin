package com.rohitjakhar.mvvmtemplate.data.remote.webservice

import com.rohitjakhar.mvvmtemplate.data.remote.dto.GetDataDto
import retrofit2.Response
import retrofit2.http.GET

interface WebService {
    @GET("endpoint")
    suspend fun getData(): Response<GetDataDto>
}
