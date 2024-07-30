package com.example.notas

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.notas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val loginButton = binding.loginButton

        loginButton.setOnClickListener {
            validateLogin()
        }

    }


    fun validateLogin(){

        with(binding){
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if(username == "Antonio" && password == "123"){
                val intent = Intent(this@MainActivity,Screen1::class.java)
                intent.putExtra("USERNAME", username)
                startActivity(intent)
            }else{
                Toast.makeText(this@MainActivity, "Nombre de usuario o Contraseña Incorrecto", Toast.LENGTH_SHORT).show()
            }
        }
    }
}