package com.example.formregistrasiviewmodel.utilities

import com.example.formregistrasiviewmodel.data.DatabasePalsu
import com.example.formregistrasiviewmodel.data.RegistrasiRepository
import com.example.formregistrasiviewmodel.ui.registrasi.RegistrasiViewModelFactory

object Injector {
    fun provideRegistrasiViewModelFactory():RegistrasiViewModelFactory{
        val registrasiRepository = RegistrasiRepository.getInstance(DatabasePalsu.getInstance().dataDiri123)
        return RegistrasiViewModelFactory(registrasiRepository)
    }
}