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
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton1 = findViewById<Button>(R.id.boton1)
        val boton2 = findViewById<Button>(R.id.boton2)
        val boton3 = findViewById<Button>(R.id.boton3)
        val imagen_erizo = findViewById<ImageView>(R.id.erizo)
        val tv = findViewById<TextView>(R.id.tv)
        val et = findViewById<EditText>(R.id.et)

        val longitud = et.length()

        boton1.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        boton2.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra(ThirdActivity.VAR1, longitud)
            startActivity(intent)
        }

        boton3.setOnClickListener {
            val aleatorio = Random.nextBoolean()

            if (aleatorio) {
                imagen_erizo.isVisible = true
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            } else {
                tv.text = "El edit text de la activity anterior contenía: " + et.text
                val intent = Intent(this, ThirdActivity::class.java)
                startActivity(intent)
            }

        }

    }
}
