package com.example.entrega_navegacionbasica

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import java.util.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton1 = findViewById<Button>(R.id.boton1)
        val boton2 = findViewById<Button>(R.id.boton2)
        val boton3 = findViewById<Button>(R.id.boton3)
        val et = findViewById<EditText>(R.id.et)

        var longitud = 0

        boton1.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        boton2.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            //longitud = et.length()
            //intent.putExtra(ThirdActivity.VAR1, longitud)
            intent.putExtra(ThirdActivity.VAR1, "El edit text de la activity anterior tenía una longitud de ${et.text.length}")
            startActivity(intent)
        }

        boton3.setOnClickListener {
            val aleatorio = Random.nextBoolean()

            // No sé cómo hacer para que aparezcan la imagen y el textview distintos :(
            // Lo he intentado pero ni idea.
            // He pensando en crear otra activity para ello, pero como tiene que ser en las mismas lo he descartado.
            if (aleatorio) {
                val intent = Intent(this, SecondActivity::class.java)
               // intent.putExtra(SecondActivity.VAR2, aleatorio)
                intent.putExtra("PasarImagenNueva", R.mipmap.erizo)
                startActivity(intent)
            } else {
                val intent = Intent(this, ThirdActivity::class.java)
                intent.putExtra(ThirdActivity.VAR1, "El edit text de la activity anterior contenía ${et.text.toString()
                    .toUpperCase(Locale.getDefault())}")
                startActivity(intent)
            }

        }

    }
}
