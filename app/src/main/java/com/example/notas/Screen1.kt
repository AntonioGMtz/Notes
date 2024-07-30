package com.example.notas

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.notas.databinding.ActivityMainBinding
import com.example.notas.databinding.ActivityScreen1Binding
import androidx.recyclerview.widget.LinearLayoutManager
import android.widget.Toast

class Screen1 : AppCompatActivity() {

    private lateinit var binding: ActivityScreen1Binding
    private lateinit var adapter: ItemAdapter
    private val items = mutableListOf<String>() // Lista de datos
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inicializar View Binding
        binding = ActivityScreen1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra("USERNAME")
        // Configura el RecyclerView
        adapter = ItemAdapter(items)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter

        // Agrega datos de ejemplo
        items.add("Antonio")
        items.add("Jesus")
        items.add("Gallegos")
        adapter.notifyDataSetChanged()

        // Configura el FloatingActionButton
        binding.fabAddItem.setOnClickListener {
            // Lógica para agregar un nuevo elemento
            // Puedes mostrar un diálogo o ir a otra actividad para agregar datos
            Toast.makeText(this, "Agregar nuevo ítem", Toast.LENGTH_SHORT).show()
        }

    }
}