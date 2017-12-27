package com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.presentation.presenters

import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.PerActivity
import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.domain.model.User
import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.domain.usecases.InsertDataFirebase
import javax.inject.Inject

/**
* @Author Carlos Ugaz
* @Github: Carlosgub
*/
@PerActivity
class MainPresenter @Inject constructor(val view: View,
                                        private val useCase: InsertDataFirebase) {

    fun insertData(user: User)  {
        useCase.insertUser(user)
    }

    interface View {
        fun ingresarUsuario(user: User)
        fun limpiarVentana()
        fun verificarCampos() :Boolean
    }
}