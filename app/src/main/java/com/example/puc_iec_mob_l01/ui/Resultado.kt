package com.example.puc_iec_mob_l01.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.puc_iec_mob_l01.databinding.ActivityMainBinding

class Resultado : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}