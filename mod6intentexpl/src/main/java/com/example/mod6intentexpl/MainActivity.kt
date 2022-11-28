package com.example.mod6intentexpl

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, TargetActivity::class.java)
        intent.putExtra("prenom","Benoit")
        startActivity(intent)
    }
}