package com.example.contador

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var contador: Int = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contadorTextView: TextView = findViewById(R.id.contadorTextView)
        val incrementarButton: Button = findViewById(R.id.incrementarButton)

        contadorTextView.text = contador.toString()

        incrementarButton.setOnClickListener {
            contador++
            contadorTextView.text = contador.toString()
        }
    }
}
