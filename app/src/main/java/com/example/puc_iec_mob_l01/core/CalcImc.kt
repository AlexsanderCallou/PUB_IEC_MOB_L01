package com.example.puc_iec_mob_l01.core
import kotlin.text.*



class CalculoImc {

    fun calcImc(peso: Double, altura: Int): Double {
        return (peso / (altura * altura))
    }

    fun main(){
        println(calcImc(112.6,176))
    }


}