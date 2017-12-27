package com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.domain.usecases
import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.domain.repository.UsersRepository
import javax.inject.Inject

/**
 * @Author Carlos Ugaz
 * @Github: Carlosgub
 */
class GetUserListUseCase @Inject constructor(private val rep: UsersRepository){

    fun getUsers()  {
        rep.getUsers()
    }

}