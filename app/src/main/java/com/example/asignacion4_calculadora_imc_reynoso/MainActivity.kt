package com.example.asignacion4_calculadora_imc_reynoso

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    //variables
    var estatura: Float = 0.0F
    var peso: Float =0.0F



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //eventos
        val etEstatura: EditText =findViewById(R.id.etEstatura)
        val etPeso: EditText = findViewById(R.id.etPeso)
        val btnCalcular: Button = findViewById(R.id.btnCalcular)
        val tvResultado: TextView = findViewById(R.id.tvResultado)

        btnCalcular.setOnClickListener{
            val estatura = etEstatura.text.toString().toFloat()
            val peso = etPeso.text.toString().toFloat()
            val imc = calcularIMC(estatura,peso)
            tvResultado.setText("Tu IMC es de "+imc.toString())
            tvResultado.visibility = TextView.VISIBLE
        }
    }

    //funciones
    fun calcularIMC(estatura: Float, peso: Float): Float {
         val IMC = peso/(estatura.pow(2))
        return IMC
    }
}