package com.example.puc_iec_mob_l01.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.puc_iec_mob_l01.databinding.ActivityCalcImcBinding

class CalcImc : AppCompatActivity() {



    private lateinit var binding : ActivityCalcImcBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalcImcBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }


}
