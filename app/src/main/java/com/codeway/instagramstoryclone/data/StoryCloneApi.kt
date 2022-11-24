package com.codeway.instagramstoryclone.data

import com.codeway.instagramstoryclone.data.models.PexelsImageResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

interface StoryCloneApi {
    @GET("v1/curated?per_page=20")
    @Headers(
        //TODO : Api Key taşınıcak
        "Authorization:563492ad6f917000010000019b38331a3ca54877abf0c34a5a8507df"
    )
    suspend fun getVideosPopular(): Response<PexelsImageResponse>
}