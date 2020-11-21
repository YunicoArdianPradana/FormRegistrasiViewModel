package com.example.formregistrasiviewmodel.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class RegistrasiDataAccessObject {
    private val listDataDiri = mutableListOf<Registrasi>()
    private val dataDiri = MutableLiveData<List<Registrasi>>()

    init{
        dataDiri.value = listDataDiri
    }

    fun addDataDiri(datadiri:Registrasi){
        listDataDiri.add(datadiri)
        dataDiri.value = listDataDiri
    }

    fun getDataDiri() = dataDiri as LiveData<List<Registrasi>>
}