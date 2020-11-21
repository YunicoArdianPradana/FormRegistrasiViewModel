package com.example.formregistrasiviewmodel.ui.registrasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.formregistrasiviewmodel.R
import com.example.formregistrasiviewmodel.data.Registrasi
import com.example.formregistrasiviewmodel.utilities.Injector
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvHasil = findViewById<TextView>(R.id.tv_hasil)
        val btnDaftar = findViewById<Button>(R.id.btn_daftar)
        val inputNama = findViewById<EditText>(R.id.et_nama)
        val inputNim = findViewById<EditText>(R.id.et_nim)
        val inputKelas = findViewById<EditText>(R.id.et_inputKelas)
        val factory = Injector.provideRegistrasiViewModelFactory()
        val viewModel = ViewModelProvider(this,factory).get(RegistrasiViewModel::class.java)

        viewModel.getDataDiri().observe(this, Observer { dataDiri->
            val stringBuilder = StringBuilder()
            dataDiri.forEach { datadiriku->
                stringBuilder.append("$datadiriku\n\n")
            }
            tvHasil.text = stringBuilder.toString()
        })

        btnDaftar.setOnClickListener{
            val dataDiri = Registrasi(inputNama.text.toString(),inputNim.text.toString(),inputKelas.text.toString())
            viewModel.addDataDiri(dataDiri)
            inputNama.setText("")
            inputNim.setText("")
            inputKelas.setText("")
        }
    }
}