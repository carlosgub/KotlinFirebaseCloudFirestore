package com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.data.repository

import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.data.sources.firebase.UsersSourceFirebase
import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.domain.model.User
import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.domain.repository.UsersRepository
import javax.inject.Inject

/**
* @Author Carlos Ugaz
* @Github: Carlosgub
*/
class UserDataRepository @Inject constructor(private val source: UsersSourceFirebase) : UsersRepository {


    override fun insertUser(user: User) {
        source.insertUser(user)
    }

    override fun getUsers() {
        return source.getUsers()
    }

}