package com.codeway.instagramstoryclone.domain.repository

import com.codeway.instagramstoryclone.domain.model.User


/**
 * To make an interaction between the User Use cases and [RandomUserRepositoryImpl]
 */
interface RandomUserRepository {

    /**
     * Gets the User's list from the REST API
     */
    suspend fun getUserList(): List<User>

}