package com.codeway.instagramstoryclone.domain.model

import android.os.Parcelable
import com.codeway.instagramstoryclon.domain.model.Name
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class User(
    @SerializedName("name") val name: Name,
    @SerializedName("location") val location: Location,
    @SerializedName("email") val email: String,
    @SerializedName("phone") val phone: String,
    @SerializedName("cell") val cell: String,
    @SerializedName("picture") val picture: Picture,
) : Parcelable