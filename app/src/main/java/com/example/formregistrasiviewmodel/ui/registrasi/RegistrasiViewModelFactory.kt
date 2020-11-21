package com.example.formregistrasiviewmodel.ui.registrasi

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.formregistrasiviewmodel.data.RegistrasiRepository

class RegistrasiViewModelFactory (private val registrasiRepository: RegistrasiRepository):ViewModelProvider.NewInstanceFactory(){
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return RegistrasiViewModel(registrasiRepository) as T
    }
}