package com.example.puc_iec_mob_l01.ui


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.puc_iec_mob_l01.databinding.ActivityCalcImcBinding
import com.example.puc_iec_mob_l01.R

import kotlin.math.roundToInt
import kotlin.math.roundToLong

class CalcImc : AppCompatActivity() {


    private lateinit var binding: ActivityCalcImcBinding
    private var result: Double = 0.0
    private var isAdulto: String = "1"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalcImcBinding.inflate(layoutInflater)
        setContentView(binding.root)
        configListners()
    }

    private fun configListners(){
        binding.btCalcular.setOnClickListener{
            callResult()
        }
    }

    private fun recuperaIdade(){
        binding.rgIdade.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.rbAdulto -> {
                    isAdulto = "1"
                }
                R.id.rbIdoso -> {
                    isAdulto = "0"
                }
            }
        }
    }
    private fun callResult(){
        recuperaIdade()

        if (!binding.etPeso.text.isNullOrBlank()
            && !binding.etAltura.text.isNullOrBlank()){

            val peso = binding.etPeso.text.toString().toDouble()
            val altura = binding.etAltura.text.toString().toDouble()

            result = peso / ((altura*altura)/10000)

            val textImc = result.roundToInt().toString()

            val intent = Intent(this, Resultado::class.java).apply {
                putExtra(IMC, textImc)
                putExtra(IDADE, isAdulto)
            }
            startActivity(intent)
        }else{
            println("Campos Vazios")
        }
    }

    companion object {
        const val IMC = "PARAMETRO_IMC"
        const val IDADE = "PARAMETRO_IDADE"
    }
}

