package com.example.canivetequixadaense

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class CalculadoraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)
    }

    fun calcular(view: View) {
        val numero1EditText: EditText = findViewById(R.id.numero1EditText)
        val numero2EditText: EditText = findViewById(R.id.numero2EditText)

        val numero1 = numero1EditText.text.toString().toDoubleOrNull()
        val numero2 = numero2EditText.text.toString().toDoubleOrNull()

        if (numero1 == null || numero2 == null) {
            Toast.makeText(this, "Os números são obrigatórios e devem ser preenchidos.", Toast.LENGTH_SHORT).show()
        } else {
            val resultadoTextView: TextView = findViewById(R.id.resultadoTextView)
            val operador = view.tag.toString()
            val resultado = when (operador) {
                "+" -> numero1 + numero2
                "-" -> numero1 - numero2
                "*" -> numero1 * numero2
                "/" -> numero1 / numero2
                else -> 0.0
            }
            resultadoTextView.text = resultado.toString()
        }
    }
}
