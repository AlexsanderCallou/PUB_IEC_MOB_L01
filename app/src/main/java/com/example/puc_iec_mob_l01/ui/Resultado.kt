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

        binding.tvResultImcd.text = imc

        if (idade == "1"){
            if(imc.toDouble() < 18.5){
                binding.tvExplicacao.setTextColor(getColor(R.color.black))
                binding.tvExplicacao.text ="Referência:\n" +
                        "IMC Abaixo de 18.5\n" +
                        "Abaixo do Peso\n" +
                        "Você está abaixo do peso ideal.\n" +
                        "Isso pode ser apenas uma característica pessoal, mas também pode ser um sinal de " +
                        "desnutrição ou de algum problema de saúde. Caso esteja perdendo peso sem motivo aparente, procure um médico."
            }
            if((imc.toDouble() >= 18.5) and  (imc.toDouble() < 25)){
                binding.tvExplicacao.setTextColor(getColor(R.color.teal_700))
                binding.tvExplicacao.text = "Referência:\n" +
                        "IMC Entre 18.5 e 25\n" +
                        "Parabéns - Você está no peso ideal."
            }
            if((imc.toDouble() >= 25) && (imc.toDouble() < 30)){
                binding.tvExplicacao.setTextColor(getColor(R.color.purple_200))
                binding.tvExplicacao.text = "Referência: \n" +
                        "IMC Entre 25 e 29.9\n" +
                        "Sobre Peso \n" +
                        "Atenção!\nAlguns quilos a mais já são suficientes para que algumas pessoas desenvolvam doenças associadas, como " +
                        "diabetes e hipertensão. É importante rever seus hábitos. Procure um médico."
            }
            if((imc.toDouble() >= 30) && (imc.toDouble() < 35)){
                binding.tvExplicacao.setTextColor(getColor(android.R.color.holo_blue_dark))
                binding.tvExplicacao.text = "Referência:\n" +
                        "IMC Entre 30  e 35\n" +
                        "Obesidade grau I\n" +
                        "Sinal de alerta!\nO excesso de peso é fator de risco para desenvolvimento de outros problemas de saúde. A boa notícia" +
                        "é que uma pequena perda de peso já traz benefícios à saúde. Procure um médico para definir o tratamento mais adequado para você"
            }
            if((imc.toDouble() >= 35) && (imc.toDouble() < 40)){
                binding.tvExplicacao.setTextColor(getColor(android.R.color.holo_orange_dark))
                binding.tvExplicacao.text = "Referência:\n" +
                        "IMC Entre 35 e 40\n" +
                        "Obesidade grau II\n" +
                        "Sinal vermelho!\nAo atingir este nível de IMC, o risco de doenças associadas está entre alto e muito alto. Busque " +
                        "ajuda de um profissional de saúde; não perca tempo."
            }
            if(imc.toDouble() > 40){
                binding.tvExplicacao.setTextColor(getColor(android.R.color.holo_red_dark))
                binding.tvExplicacao.text = "Referência:\n" +
                        "IMC Acima de 40\n" +
                        "Obesidade grau III\n" +
                        "Sinal vermelho!\nAo atingir este nível de IMC, o risco de doenças associadas é muito alto. Busque ajuda de um " +
                        "profissional de saúde; não perca tempo."
            }
        }else{
            if(imc.toDouble() < 22){
                binding.tvExplicacao.setTextColor(getColor(R.color.black))
                binding.tvExplicacao.text = "Muita atenção:\nVocê está com baixo peso."
            }
            if((imc.toDouble() >= 22) and  (imc.toDouble() < 27)){
                binding.tvExplicacao.text = "Muito Bem:\nVocê está com peso Adequado ou eutrófico."
            }
            if((imc.toDouble() > 27)){
                binding.tvExplicacao.setTextColor(getColor(android.R.color.holo_red_dark))
                binding.tvExplicacao.text = "Atenção: Você está com Sobrepeso."
            }
        }


    }
}