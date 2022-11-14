package com.example.homework8_1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework8_1.databinding.ActivityMain2Binding
import com.example.homework8_1.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding:ActivityMain2Binding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        val name = intent.getStringExtra("keyName")
        val age = intent.getIntExtra("keyAge",0)

        binding.tv2.text = "$name\n"+
                "$age"
    }
}