package com.example.mod7tpdice

import androidx.lifecycle.ViewModel

class DiceViewModel : ViewModel() {
    var valueDice = 0

    fun launch(nbSides: Int) {
        valueDice = (1..nbSides).random()
    }
}