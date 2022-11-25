package com.codeway.instagramstoryclone.domain.model

import com.google.gson.annotations.SerializedName

data class ApiResponse(
    @SerializedName("results")
    val userList: List<User>
)
