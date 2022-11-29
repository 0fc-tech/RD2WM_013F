package com.example.mod7tpdice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mod7tpdice.databinding.ActivityDiceBinding

class DiceActivity : AppCompatActivity() {
    lateinit var binding: ActivityDiceBinding
    lateinit var vm : DiceViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_dice)
        vm = ViewModelProvider(this).get(DiceViewModel::class.java)
        binding.vm = vm

        binding.button6.setOnClickListener {
            vm.launch(6)
            binding.textViewValueDice.text = vm.valueDice.toString()
        }
    }
}