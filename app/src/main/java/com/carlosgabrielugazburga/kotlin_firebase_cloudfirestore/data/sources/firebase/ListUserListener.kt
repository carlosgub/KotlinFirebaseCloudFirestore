package com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.data.sources.firebase

import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.domain.model.User

/**
 * @Author Carlos Ugaz
 * @Github: Carlosgub
 */
interface ListUserListener {
    fun listUser(usuarios : List<User>)
}