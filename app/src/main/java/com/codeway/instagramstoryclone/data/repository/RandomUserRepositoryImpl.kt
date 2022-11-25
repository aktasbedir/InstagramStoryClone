package com.codeway.instagramstoryclone.data.repository

import com.codeway.instagramstoryclone.common.Resource
import com.codeway.instagramstoryclone.data.remote.StoryCloneApi
import com.codeway.instagramstoryclone.data.sources.RemoteDataSource
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
/*
class RandomUserRepositoryImpl @Inject constructor(private var remoteDataSource: RemoteDataSource) :
    RandomUserRepository {


    */
/**
 * Gets the User's list from the REST API
 *//*

    override fun getUserList(): Resource<List<User>> {

        return remoteDataSource.getResponse()
            .retry(3)
            .map { apiResponse ->
                Resource.Success(apiResponse.userList) as Resource<List<User>>
            }
            .onErrorReturnItem(Resource.Error("an error has been occurred"))
            .observeOn(Schedulers.io())

    }

}*/
