package com.example.puc_iec_mob_l01.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.puc_iec_mob_l01.databinding.ActivityResultadoBinding
import com.example.puc_iec_mob_l01.R
import com.example.puc_iec_mob_l01.ui.CalcImc.Companion.IMC
import com.example.puc_iec_mob_l01.ui.CalcImc.Companion.IDADE

class Resultado : AppCompatActivity() {

    private lateinit var binding : ActivityResultadoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultadoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        run()
    }

    private fun run(){
        val idade: String = intent.getStringExtra(IDADE).toString()
        val imc: String = intent.getStringExtra(IMC).toString()

        binding.tvResultImc.text = imc


    }
}