package com.codeway.instagramstoryclone.data.remote

import com.codeway.instagramstoryclone.domain.model.ApiResponse
import com.codeway.instagramstoryclone.domain.model.User
import retrofit2.http.GET
import retrofit2.http.Query

interface StoryCloneApi {
    @GET(".")
    suspend fun getResponse(
        @Query("results") resultAmount: Int = 10
    ): List<User>



}