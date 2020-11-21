package com.example.formregistrasiviewmodel.data

class RegistrasiRepository private constructor(private val dataDiri123: RegistrasiDataAccessObject) {
    fun addDataDiri(datadiri: Registrasi) {
        dataDiri123.addDataDiri(datadiri)
    }

    fun getDataDiri() = dataDiri123.getDataDiri()

    companion object {
        @Volatile
        private var instance: RegistrasiRepository? = null
        fun getInstance(mkl: RegistrasiDataAccessObject) =
            instance ?: synchronized(this) {
                instance ?: RegistrasiRepository(mkl).also { instance = it }
            }
    }
}