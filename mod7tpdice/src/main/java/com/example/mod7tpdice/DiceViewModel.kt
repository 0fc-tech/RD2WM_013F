package com.example.mod7tpdice

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DiceViewModel : ViewModel() {
    val valueDice = MutableLiveData(0)
    val nbSides = MutableLiveData(6)

    fun launch(nbSides: Int) {
        this.nbSides.value = nbSides
        valueDice.value = (1..nbSides).random()
    }
}