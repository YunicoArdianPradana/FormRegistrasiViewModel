package com.example.formregistrasiviewmodel.ui.registrasi

import androidx.lifecycle.ViewModel
import com.example.formregistrasiviewmodel.data.Registrasi
import com.example.formregistrasiviewmodel.data.RegistrasiRepository

class RegistrasiViewModel (private val registrasiRepository: RegistrasiRepository):ViewModel(){
    fun getDataDiri() = registrasiRepository.getDataDiri()
    fun addDataDiri(datadiri: Registrasi) = registrasiRepository.addDataDiri(datadiri)
}