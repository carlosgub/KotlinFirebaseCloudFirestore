package com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.domain.repository

import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.domain.model.User

/**
* @Author Carlos Ugaz
* @Github: Carlosgub
*/

interface UsersRepository {

    fun getUsers()
    fun insertUser(user : User)

}