package com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.data

import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.data.repository.UserDataRepository
import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.data.sources.FirebaseModule
import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.data.sources.firebase.EventFirebaseListener
import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.data.sources.firebase.UsersSourceFirebase
import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.domain.repository.UsersRepository
import dagger.Binds
import dagger.Module

/**
 * @Author Carlos Ugaz
 * @Github: Carlosgub
 */
@Module(includes = arrayOf(FirebaseModule::class))
abstract class DataModule {

    @Binds abstract fun bindCategoriesRepository(repository: UserDataRepository): UsersRepository

}