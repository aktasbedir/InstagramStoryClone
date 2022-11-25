package com.codeway.instagramstoryclone.data.sources

import com.codeway.instagramstoryclone.domain.model.ApiResponse

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * remove data source for the random friends list
 *
 * that will fetch the data from the API,
 *
 * in the [ApiResponse] format
 *
 * wrapped in a [Call] class
 */
interface RemoteDataSource {

    @GET(".")
    fun getResponse(
        @Query("results") resultAmount: Int = 10
    ): ApiResponse
}