package com.example.mod9room

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.mod9room.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val viewModel : OiseauViewModel by viewModels { OiseauViewModel.Factory }
    lateinit var dataBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        dataBinding.vm = viewModel
        dataBinding.lifecycleOwner = this
        val resultOiseau = viewModel.addOiseau(Oiseau(
            0,
            "Pie",
            true,
            "Noir",
            35) )
        resultOiseau.observe(this,{ idOiseauAdded : Long ->
            viewModel.getOiseauById(idOiseauAdded)
        })

    }


}