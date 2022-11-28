package com.example.mod6intentimpl

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intentGeo = Intent(Intent.ACTION_VIEW, Uri.parse("geo:45.0626,-0.7642686"))
        startActivity(intentGeo)
    }
}