package com.example.mod7tpdice

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mod7tpdice.databinding.ActivityDiceBinding

class DiceActivity : AppCompatActivity(), OnClickListener {
    lateinit var binding: ActivityDiceBinding
    lateinit var vm : DiceViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_dice)
        vm = ViewModelProvider(this).get(DiceViewModel::class.java)
        binding.vm = vm
        binding.lifecycleOwner = this
    }

    override fun onClick(view: View?) {
        when(view){
            //is Button -> vm.launch(view.text.toString().toInt())
            binding.button6 -> vm.launch(6)
            binding.button8 -> vm.launch(8)
            binding.button10 -> vm.launch(10)
            binding.button20 -> vm.launch(20)
        }
    }
}