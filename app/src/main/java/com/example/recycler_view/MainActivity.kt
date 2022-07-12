package com.example.recycler_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycler_view.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayNames()
    }

    fun displayNames(){
        var namesList = listOf("Kaytete","Rose","Brenda","Grace","Suzan")
        var namesAdopter = Names_RecyclerView_Adapter(namesList)
        binding.rvNames.layoutManager = LinearLayoutManager(this)
        binding.rvNames.adapter = namesAdopter

    }
}