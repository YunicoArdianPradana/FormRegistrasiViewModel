package com.example.formregistrasiviewmodel.data

class DatabasePalsu private constructor(){

    var dataDiri123= RegistrasiDataAccessObject()
        private set

    companion object{
        @Volatile
        private var instance: DatabasePalsu?= null
        fun getInstance() =
            instance ?: synchronized(this){
                instance ?: DatabasePalsu().also { instance = it }
            }
    }
}