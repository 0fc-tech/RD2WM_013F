package com.example.mod7compteur


import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.floatingactionbutton.FloatingActionButton

class CompteurActivity : AppCompatActivity() {
    val textView : TextView by lazy { findViewById(R.id.textView) }
    val fabIncrement : FloatingActionButton by lazy { findViewById(R.id.fabIncrement) }
    //var compteur = 0
    lateinit var viewModel : CompteurViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compteur)
        viewModel = ViewModelProvider(this)[CompteurViewModel::class.java]
        textView.text = viewModel.compteur.toString()
        fabIncrement.setOnClickListener {
            viewModel.increment()
            textView.text = (viewModel.compteur).toString()
        }
    }

    //override fun onSaveInstanceState(outState: Bundle) {
    //    super.onSaveInstanceState(outState)
    //    outState.putInt("compteur",compteur)
    //}
//
    //override fun onRestoreInstanceState(savedInstanceState: Bundle) {
    //    super.onRestoreInstanceState(savedInstanceState)
    //    compteur = savedInstanceState.getInt("compteur")
    //    textView.text = compteur.toString()
    //}
}