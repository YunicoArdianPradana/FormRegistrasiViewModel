package com.example.formregistrasiviewmodel.data

data class Registrasi(val nama: String, val nim: String, val kelas: String) {
    override fun toString(): String {
        return "$nama-$nim-$kelas";
    }
}