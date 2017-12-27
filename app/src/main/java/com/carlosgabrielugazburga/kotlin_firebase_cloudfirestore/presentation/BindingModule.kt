package com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.presentation

import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.PerActivity
import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.data.sources.firebase.EventFirebaseListener
import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.data.sources.firebase.UsersSourceFirebase
import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.presentation.presenters.ListUserPresenter
import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.presentation.presenters.MainPresenter
import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.presentation.views.ListUserActivity
import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.presentation.views.MainActivity
import dagger.Binds
import dagger.Module

/**
 * @Author Carlos Ugaz
 * @Github: Carlosgub
 */
@Module
abstract class BindingModule {

    @Binds
    @PerActivity
    abstract fun provideMainView(activity: MainActivity): MainPresenter.View

    /*@Binds
    @PerActivity
    abstract fun provideListUserView(activity: ListUserActivity): ListUserPresenter.View*/


    @Binds
    @PerActivity
    abstract fun bindEventListener(activity: MainActivity): EventFirebaseListener

}