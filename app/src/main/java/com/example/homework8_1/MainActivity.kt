package com.example.homework8_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework8_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener{
            val intent = Intent(this,MainActivity2::class.java)

            intent.putExtra("keyName",binding.edtName.text.toString())
            intent.putExtra("keyAge",binding.edtAge.text.toString().toInt())

            startActivity(intent)
        }
    }
}