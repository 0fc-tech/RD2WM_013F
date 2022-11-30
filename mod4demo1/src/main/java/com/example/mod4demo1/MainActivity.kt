package com.example.mod4demo1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //TODO récupérer nos vues
        val textView = findViewById<TextView>(R.id.textView)
        val editText = findViewById<EditText>(R.id.editText)
        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)
            //.also { it?.rating = 3f }
        //TODO Affecter leur nouveau champ
        textView.text = "Hello"
        //editText.setText("Comment allez-vous?")
        editText.setText("")
        editText.hint = "Comment allez-vous?"
        
        ratingBar.numStars = 5
        ratingBar.stepSize = 0.1f
        ratingBar.rating = 3.7f
        ratingBar.setIsIndicator(true)

        //TODO Afficher une snackbar lors du clic sur le bouton
        findViewById<Button>(R.id.buttonDecrement).also {
            it.setOnClickListener {
                Snackbar.make(
                    it,
                    "Et voilà une snackbar pour toi :)",
                    Snackbar.LENGTH_LONG)
                    .setAction("ANNULER") {
                        ratingBar.rating = 1.0f
                    }
                    .show()
            }
        }
    }
}