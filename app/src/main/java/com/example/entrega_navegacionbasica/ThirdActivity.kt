package com.example.entrega_navegacionbasica

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    companion object {
        const val VAR1 = "MiClave"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        tv.text = intent.getStringExtra(VAR1)

        /*val tv = findViewById<TextView>(R.id.tv)
        val longitudEditText = intent.getIntExtra(VAR1,0)

        longitudEditText.let {
            tv.text = "El edit text de la activity anterior tenía una longitud" +
                    " de " + longitudEditText + " caracteres"
        }*/




    }
}