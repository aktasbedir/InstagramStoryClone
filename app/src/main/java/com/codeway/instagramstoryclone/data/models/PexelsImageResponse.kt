package com.codeway.instagramstoryclone.data.models

data class PexelsImageResponse(
    val nextPage: String,
    val page: Int,
    val perPage: Int,
    val photos: List<Photo>
)