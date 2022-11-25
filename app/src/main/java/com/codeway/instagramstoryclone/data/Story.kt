package com.codeway.instagramstoryclone.data

import android.os.Parcelable
import com.bumptech.glide.load.resource.bitmap.VideoDecoder.parcel
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Story(val url: String, val storyDate: Long) : Parcelable {

    fun isVideo() =  url.contains(".mp4")
}