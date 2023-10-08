package com.rodrigotelles.contadorpessoas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_increase: Button = findViewById(R.id.button_increase)
        val result_text: TextView = findViewById(R.id.result_text)
        val button_decrease: Button = findViewById(R.id.button_decrease)

        button_increase.setOnClickListener {
            result_text.setText("" + increaseCounter())
        }

        button_decrease.setOnClickListener {
            result_text.setText("" + decreaseCounter())
        }


    }

    fun increaseCounter(): Int {
        counter++
        return counter
    }

    fun decreaseCounter(): Int {
        if (counter > 0) {
            counter--
        }
        return counter
    }
}