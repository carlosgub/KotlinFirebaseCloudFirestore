package com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.domain.usecases

import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.domain.model.User
import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.domain.repository.UsersRepository
import javax.inject.Inject

/**
* @Author Carlos Ugaz
* @Github: Carlosgub
*/

class InsertDataFirebase @Inject constructor(private val rep: UsersRepository){

    fun insertUser(user: User) {
        rep.insertUser(user)
    }
}