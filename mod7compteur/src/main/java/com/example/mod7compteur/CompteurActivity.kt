package com.example.mod7compteur


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mod7compteur.databinding.ActivityCompteurBinding

class CompteurActivity : AppCompatActivity() {
    //val textView : TextView by lazy { findViewById(R.id.textView) }
    //val fabIncrement : FloatingActionButton by lazy { findViewById(R.id.fabIncrement) }
    //var compteur = 0
    lateinit var viewModel : CompteurViewModel
    lateinit var binding : ActivityCompteurBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_compteur)
        binding.lifecycleOwner = this
        viewModel = ViewModelProvider(this)[CompteurViewModel::class.java]
        binding.viewModel = viewModel
        //textView.text = viewModel.compteur.toString()
        binding.fabIncrement.setOnClickListener {
            viewModel.increment()
            //binding.viewModel = viewModel

        }
        binding.buttonDecrement.setOnClickListener {
            viewModel.decrement()
            //binding.viewModel = viewModel
        }
        viewModel.compteur.observe(this,{ compteur : Int ->
            if(compteur>10) {
                binding.textView.setTextColor(0xFF00FF)
            }
        })
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