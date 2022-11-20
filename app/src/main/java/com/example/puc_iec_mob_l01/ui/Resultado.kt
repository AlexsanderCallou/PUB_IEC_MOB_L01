package com.example.puc_iec_mob_l01.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.puc_iec_mob_l01.databinding.ActivityResultadoBinding

class Resultado : AppCompatActivity() {

    private lateinit var binding : ActivityResultadoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultadoBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}