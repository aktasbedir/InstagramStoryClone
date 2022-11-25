package com.codeway.instagramstoryclone.data.repository

import com.codeway.instagramstoryclone.data.remote.StoryCloneApi
import com.codeway.instagramstoryclone.domain.model.User
import com.codeway.instagramstoryclone.domain.repository.RandomUserRepository
import javax.inject.Inject


class RandomUserRepositoryImpl @Inject constructor(
    private val api: StoryCloneApi

) : RandomUserRepository {
    override suspend fun getUserList(): List<User> {
        return api.getResponse()
    }

}

