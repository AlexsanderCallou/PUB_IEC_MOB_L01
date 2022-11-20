package com.example.puc_iec_mob_l01.ui


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts
import com.example.puc_iec_mob_l01.databinding.ActivityCalcImcBinding
import com.example.puc_iec_mob_l01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root )
        configFabListner()
    }
    private fun configFabListner(){
        binding.fabCalcularImC.setOnClickListener{
            val intent = Intent(this, CalcImc::class.java)
            startActivity(intent)
        }
    }
}
