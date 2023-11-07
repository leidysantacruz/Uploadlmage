package com.example.uploadlmage

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel {
    var mensaje = MutableLiveData<String>()
    fun  enviarFoto(image: ImageeModel, viewModelScope: Any) {
        viewModelScope.launch(Dispatchers.IO) {
            val response = RetrofitClient.webService.enviarImage()
        }
    }
}