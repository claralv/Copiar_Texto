package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.boton.setOnClickListener {
            binding.saludo.text = "Hola, " +binding.nombre.text.toString()
            Toast.makeText(this,"Esto es una tostada", Toast.LENGTH_LONG).show()

        }




    /*
        setContentView(R.layout.activity_main)

        //Referencia al botón
        var btn = findViewById<Button>(R.id.boton)

        //Referencia al cuadro de texto
        var texto= findViewById<EditText>(R.id.nombre)

        //Referencia al cuadro de saludo
        var saludo = findViewById<TextView>(R.id.saludo)

        var limpiar = findViewById<Button>(R.id.bLimpiar)

        btn.setOnClickListener {
            //saludo.text = "Hola, "  +texto.text.toString()
            saludo.setText(texto.text.toString())

        }

        limpiar.setOnClickListener {
            texto.text.clear()
            saludo.text = ""
        }
    */
    }
}