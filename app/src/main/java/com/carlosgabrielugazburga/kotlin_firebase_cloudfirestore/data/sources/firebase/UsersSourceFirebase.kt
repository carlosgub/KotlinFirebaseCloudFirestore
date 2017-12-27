package com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.data.sources.firebase

import android.util.Log
import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.domain.model.User
import com.google.firebase.firestore.FirebaseFirestore
import javax.inject.Inject

/**
* @Author Carlos Ugaz
* @Github: Carlosgub
*/
class UsersSourceFirebase @Inject constructor(private val firebaseFirestore: FirebaseFirestore, private val eventListener: EventFirebaseListener){


    fun getUsers() {
        firebaseFirestore.collection("usuarios").get().addOnCompleteListener{
            if(it.isSuccessful){
                for (document in it.result){
                    Log.d(":)",document.data.toString())
                }

            }else{
                Log.d(":)",it.exception.toString())
            }
        }
    }

    fun insertUser(user : User){
        firebaseFirestore.collection("usuarios").add(user).addOnSuccessListener {
            eventListener.seRegistroUsuario()
        }.addOnFailureListener{
            eventListener.huboErrorUsuario()
        }
    }

}