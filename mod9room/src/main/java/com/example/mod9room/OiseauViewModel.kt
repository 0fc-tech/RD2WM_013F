package com.example.mod9room

import androidx.lifecycle.*
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.CreationExtras
import kotlinx.coroutines.launch

class OiseauViewModel(var dao: OiseauDao) :ViewModel(){
    val oiseau = MutableLiveData<Oiseau?>(null)

    fun getOiseauById(id:Long){
        viewModelScope.launch{
            oiseau.value = dao.get(id)
        }
    }
    fun addOiseau(oiseau : Oiseau) : LiveData<Long>{
        val result = MutableLiveData<Long>()
        viewModelScope.launch {
            result.value = dao.insert(oiseau)
        }
        return result
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