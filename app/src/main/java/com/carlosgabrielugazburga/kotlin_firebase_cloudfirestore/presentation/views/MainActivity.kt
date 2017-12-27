package com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.presentation.views

import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.Toast
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.R
import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.data.sources.firebase.EventFirebaseListener
import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.domain.model.User
import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.presentation.BaseActivity
import com.carlosgabrielugazburga.kotlin_firebase_cloudfirestore.presentation.presenters.MainPresenter
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : BaseActivity(),MainPresenter.View, EventFirebaseListener {


    lateinit var progressDialog:ProgressDialog

    override fun getLayout(): Int {
        return R.layout.activity_main
    }

    @Inject lateinit var presenter: MainPresenter

    override fun ingresarUsuario(user: User) {
        progressDialog.show()
        presenter.insertData(user)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val toolBar = findViewById<Toolbar>(R.id.toolbar)
        toolBar.title = "Agregar Usuario"
        setSupportActionBar(toolBar)

        progressDialog= ProgressDialog(this)
        progressDialog.setTitle("Loading...")
        bRegistrarUsuario.setOnClickListener {
            if(verificarCampos()){
                val nombre = sNombresUsuario.text.toString()
                val apellidos = sApellidosUsuario.text.toString()
                val sexo = sSexoUsuario.text.toString()
                val edad = nEdad.text.toString().toInt()
                val usuario = User(nombre,apellidos,sexo,edad)
                ingresarUsuario(usuario)
            }else{
                Toast.makeText(this,"Algun campo esta vacio del usuario",Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun verificarCampos(): Boolean {
        return !(sNombresUsuario.text.toString().isEmpty() || sApellidosUsuario.text.toString().isEmpty() ||
                sSexoUsuario.text.toString().isEmpty() || nEdad.text.toString().isEmpty())
    }

    override fun seRegistroUsuario() {
        limpiarVentana()
        progressDialog.dismiss()
        Toast.makeText(applicationContext,"Se ha ingresado el usuario exitosamente",Toast.LENGTH_LONG).show()
    }

    override fun limpiarVentana() {
        sNombresUsuario.setText("")
        sApellidosUsuario.setText("")
        sSexoUsuario.setText("")
        nEdad.setText("")
    }

    override fun huboErrorUsuario() {
        progressDialog.dismiss()
        Toast.makeText(applicationContext,"Hubo un error al ingresar el usuario",Toast.LENGTH_LONG).show()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.list) {
            startActivity(Intent(applicationContext,ListUserActivity ::class.java))
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
