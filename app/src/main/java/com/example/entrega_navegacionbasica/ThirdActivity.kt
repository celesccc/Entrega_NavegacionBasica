package com.example.entrega_navegacionbasica

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {

    companion object {
        const val VAR1 = "ET"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val tv = findViewById<TextView>(R.id.tv)
        val longitudEditText = intent.getIntExtra(VAR1,0)

        longitudEditText.let {
            tv.text = "El edit text de la activity anterior tenía una longitud" +
                    " de " + longitudEditText + " caracteres"
        }


    }
}