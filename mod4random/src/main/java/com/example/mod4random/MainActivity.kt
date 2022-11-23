package com.example.mod4random

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var editTextMin: EditText
    lateinit var editTextMax: EditText
    lateinit var buttonGenerate: Button
    lateinit var textViewResult : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextMax = findViewById(R.id.editTextMax)
        editTextMin = findViewById(R.id.editTextMin)
        buttonGenerate = findViewById(R.id.buttonGenerate)
        textViewResult = findViewById(R.id.textViewResult)

        buttonGenerate.setOnClickListener {
            val boundMin = editTextMin.text.toString().toIntOrNull()
            val boundMax = editTextMax.text.toString().toIntOrNull()
            if (boundMin == null || boundMax == null){
                Toast.makeText(
                    this,
                    "Merci de remplir les bornes avec un nombre entier",
                    Toast.LENGTH_SHORT).show()
            }else{
                textViewResult.text = "Résultat : ${(boundMin..boundMax).random()}"
            }
        }

    }

}