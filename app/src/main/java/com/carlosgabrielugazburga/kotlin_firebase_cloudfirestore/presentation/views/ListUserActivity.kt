package com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.presentation.views

import android.os.Bundle
import android.support.v7.widget.Toolbar
import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.R
import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.presentation.BaseActivity
import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.presentation.presenters.ListUserPresenter
import javax.inject.Inject

class ListUserActivity : BaseActivity() {

    @Inject lateinit var presenter: ListUserPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Toolbar
        val toolBar = findViewById<Toolbar>(R.id.toolbar)
        toolBar.title = "Mostrar Usuarios"
        presenter.getUsers()
        setSupportActionBar(toolBar)


    }

    override fun getLayout(): Int {
        return R.layout.activity_list_user
    }

}
