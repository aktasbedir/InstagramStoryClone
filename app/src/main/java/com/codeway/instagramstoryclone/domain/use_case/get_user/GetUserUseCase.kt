package com.codeway.instagramstoryclone.domain.use_case.get_user

import com.codeway.instagramstoryclone.common.Resource
import com.codeway.instagramstoryclone.domain.model.User
import com.codeway.instagramstoryclone.domain.repository.RandomUserRepository
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.Flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject


class GetUserUseCase @Inject constructor(
    private val repository:RandomUserRepository
) {
    operator fun invoke(): Flow<Resource<List<User>>> = flow {
        try {
            emit(Resource.Loading())
            val users = repository.getUserList()
            emit(Resource.Success(users))
        } catch(e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occured"))
        } catch(e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection."))
        }
    }
}