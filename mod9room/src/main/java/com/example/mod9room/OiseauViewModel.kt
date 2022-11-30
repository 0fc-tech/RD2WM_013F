package com.example.mod9room

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.CreationExtras

class OiseauViewModel(var dao: OiseauDao) :ViewModel(){
    val oiseau = MutableLiveData<Oiseau?>(null)

    fun getOiseau(){
        oiseau.value = dao.get(1)
    }
    companion object {
        val Factory: ViewModelProvider.Factory = object : ViewModelProvider.Factory {
            @Suppress("UNCHECKED_CAST")
            override fun <T : ViewModel> create(
                modelClass: Class<T>,
                extras: CreationExtras
            ): T {
                // Get the Application object from extras
                val application = checkNotNull(extras[APPLICATION_KEY])

                return OiseauViewModel(
                    AppDatabase.getInstance(application.applicationContext).oiseauDao()
                ) as T
            }
        }
    }

}