package com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.presentation.presenters

import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.PerActivity
import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.domain.model.User
import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.domain.usecases.GetUserListUseCase
import javax.inject.Inject

/**
 * @Author Carlos Ugaz
 * @Github: Carlosgub
 */
@PerActivity
class ListUserPresenter @Inject constructor(//val view: View,
                                            private val useCase: GetUserListUseCase){

    fun getUsers(){
        useCase.getUsers()
    }

    /*interface View {
        fun verUsuarios(usuarios : List<User>?)
    }*/
}