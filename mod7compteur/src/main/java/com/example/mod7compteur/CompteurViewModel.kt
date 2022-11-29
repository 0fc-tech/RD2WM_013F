package com.example.mod7compteur

import androidx.lifecycle.ViewModel

class CompteurViewModel : ViewModel() {
    var compteur = 0

    fun increment(){
        compteur++
    }
}