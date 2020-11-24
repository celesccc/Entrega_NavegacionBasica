package com.example.entrega_navegacionbasica

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    companion object {
        const val VAR2 = "IMAGE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //val imagen_gato = findViewById<ImageView>(R.id.gato)
       // val imagen_erizo = findViewById<ImageView>(R.id.erizo)
        //imagen_gato.isVisible = true

       // Forma cutre: val idRecibido = intent.getIntExtra("PasarImagenNueva",0)
        val idRecibido = intent.getIntExtra(VAR2,0)
        if (idRecibido!=0) {
            gato.setImageResource(idRecibido)
        }
    }
}