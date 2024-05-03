package com.fiap.cp2suppliers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SupplierListActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private val suppliers = mutableListOf<Supplier>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_supplier_list)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        suppliers.addAll(getSuppliers())

        val category = intent.getStringExtra("category")
        val filteredSuppliers = suppliers.filter { it.category == category }

        val adapter = SupplierAdapter(filteredSuppliers, this)
        recyclerView.adapter = adapter

        val btnBackHome = findViewById<Button>(R.id.backHome)

        btnBackHome.setOnClickListener {
            val intent = Intent(this, Main::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun getSuppliers(): List<Supplier> {
        val suppliers = mutableListOf<Supplier>()
        suppliers.addAll(listOf(
            Supplier("Electrolux", "Eletrodomésticos", 7),
            Supplier("Samsung Electronics", "Eletrodomésticos", 9),
            Supplier("Brastemp", "Eletrodomésticos", 7),
            Supplier("Kabum", "Eletrônicos", 9),
            Supplier("Apple", "Eletrônicos", 7),
            Supplier("Microsoft", "Eletrônicos", 7),
            Supplier("Daiichi Sankyo", "Saúde", 8),
            Supplier("Johnson & Johnson", "Saúde", 8),
            Supplier("Roche", "Saúde", 9),
            Supplier("Dunder Mifflin", "Escritório", 10),
            Supplier("Staples", "Escritório", 5),
            Supplier("Office Depot", "Escritório", 7)
        ))
        return suppliers
    }
}