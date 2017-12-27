package com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.data.sources

import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.FirebaseFirestore
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * @Author Carlos Ugaz
 * @Github: Carlosgub
 */
@Module
class FirebaseModule {

    @Provides
    @Singleton
    fun provideFirebaseDatabase(): FirebaseFirestore {
        val firebaseDatabase = FirebaseFirestore.getInstance()
        return firebaseDatabase
    }
}