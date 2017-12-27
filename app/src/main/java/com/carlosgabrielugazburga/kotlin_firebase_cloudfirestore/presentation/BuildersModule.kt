package com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.presentation

import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.PerActivity
import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.presentation.views.ListUserActivity
import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.presentation.views.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * @Author Carlos Ugaz
 * @Github: Carlosgub
 */
@Module
abstract class BuildersModule {
    @PerActivity
    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity
}