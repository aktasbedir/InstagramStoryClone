package com.codeway.instagramstoryclone.domain.repository

import com.codeway.instagramstoryclone.common.Resource
import com.codeway.instagramstoryclone.domain.model.User


/**
 * To make an interaction between the User Use cases and [RandomUserRepositoryImpl]
 */
interface RandomUserRepository {

    /**
     * Gets the User's list from the REST API
     */
    suspend fun getUserList(): List<User>
    // i should not use android frameworks in the domain layer,
    // but as of now, i could not find any work around
}