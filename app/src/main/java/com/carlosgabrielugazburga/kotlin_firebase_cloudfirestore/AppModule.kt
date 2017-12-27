package com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore


import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.data.DataModule
import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.presentation.BindingModule
import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.presentation.BuildersModule
import dagger.Module
import dagger.android.support.AndroidSupportInjectionModule

/**
 * @author Kevin Salazar
 * @link kevicsalazar.com
 */
@Module(includes = arrayOf(
        AndroidSupportInjectionModule::class,
        BindingModule::class,
        BuildersModule::class,
        DataModule::class))
class AppModule {

}