package com.example.mod6intentexpl

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class TargetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)
        val prenom = intent.getStringExtra("prenom")
        Toast.makeText(this, "Hello $prenom", Toast.LENGTH_SHORT).show()

    }
}