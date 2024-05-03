package com.fiap.cp2suppliers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fiap.cp2suppliers.databinding.ActivityMainBinding

class Main : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.household.setOnClickListener { navigate("Eletrodomésticos") }
        binding.electronics.setOnClickListener { navigate("Eletrônicos") }
        binding.health.setOnClickListener { navigate("Saúde") }
        binding.officeSupplies.setOnClickListener { navigate("Escritório") }
    }

    private fun navigate(category: String) {
        val intent = Intent(this, SupplierListActivity::class.java)
        val bundle = Bundle()
        bundle.putString("category", category)
        intent.putExtras(bundle)
        startActivity(intent)
    }
}