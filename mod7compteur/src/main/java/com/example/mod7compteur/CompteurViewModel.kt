package com.example.mod7compteur

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CompteurViewModel : ViewModel() {
    val compteur = MutableLiveData(0)
    //var compteur = 0

    fun increment(){
        //compteur++
        // La valeur compteur = la valeur du compteur + 1
        compteur.value = compteur.value?.plus(1)
        //if(compteur.value != null){
        //    compteur.value = compteur.value!! + 1
        //}
    }
    fun decrement(){
        //compteur--
        compteur.value = compteur.value?.minus(1)
    }

}