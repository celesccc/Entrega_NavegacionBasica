package com.example.entrega_navegacionbasica

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible

class SecondActivity : AppCompatActivity() {

    /*companion object {
        const val VAR2 = "IMAGE"
    }*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val imagen_gato = findViewById<ImageView>(R.id.gato)
       // val imagen_erizo = findViewById<ImageView>(R.id.erizo)

        imagen_gato.isVisible = true

        /*val booleano = intent.getBooleanExtra(VAR2, false)
        booleano.let {
            imagen_erizo.isVisible = true
        }*/
    }
}