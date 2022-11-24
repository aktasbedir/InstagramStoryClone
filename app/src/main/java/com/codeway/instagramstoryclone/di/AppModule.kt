package com.codeway.instagramstoryclone.di

import com.codeway.instagramstoryclone.data.StoryCloneApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

//TODO : Constant classına alınacak
private const val BASE_URL = "https://api.pexels.com/"

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {
@Singleton
@Provides
fun provideStoryCloneApi():StoryCloneApi = Retrofit
    .Builder()
    .baseUrl(BASE_URL)
    .addConverterFactory(GsonConverterFactory.create())
    .build()
    .create(StoryCloneApi::class.java)
}