package com.example.notas

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.notas.databinding.ActivityMainBinding
import com.example.notas.databinding.ActivityScreen1Binding

class Screen1 : AppCompatActivity() {

    private lateinit var binding: ActivityScreen1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inicializar View Binding
        binding = ActivityScreen1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra("USERNAME")
        binding.welcomeTextView.text = "Bienvenido, $username"
    }
}