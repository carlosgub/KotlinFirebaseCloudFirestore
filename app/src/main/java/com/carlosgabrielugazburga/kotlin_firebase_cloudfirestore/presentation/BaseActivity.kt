package com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.presentation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * @Author Carlos Ugaz
 * @Github: Carlosgub
 */
abstract class BaseActivity : AppCompatActivity() {

    /**
     * The onCreate base will set the view specified in [layout]
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
    }

    /**
     * @return The layout that's gonna be the activity view.
     */
    protected abstract fun getLayout(): Int




}