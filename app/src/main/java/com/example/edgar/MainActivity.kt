package com.example.edgar

import android.app.Activity
import android.os.Bundle
import com.example.edgar.databinding.ActivityMainBinding
//el activity es una vista
// declarando una clase
class MainActivity : Activity() {
    // Una variable tipo privada
    // lateinit: sirve para declara una propiedad cuando se contruye un objeto
    private lateinit var binding: ActivityMainBinding
    //overrible: sobre escribir
    //Super: esta llamado a onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //asignado valor
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //modificar el valor de textview
        //binding.text.text="edgar"

    }
}