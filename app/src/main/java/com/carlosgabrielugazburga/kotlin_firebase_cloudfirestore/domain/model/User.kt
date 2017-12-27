package com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.domain.model

import paperparcel.PaperParcel
import paperparcel.PaperParcelable

/**
* @Author Carlos Ugaz
* @Github: Carlosgub
*/

@PaperParcel data class User (
    val nombre:String ="",
    val apellidos:String = "",
    val sexo:String = "",
    val edad: Number ?= null
): PaperParcelable {

    companion object {

        @JvmField val CREATOR = PaperParcelUser.CREATOR

    }

}