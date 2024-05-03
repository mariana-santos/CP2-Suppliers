package com.fiap.cp2suppliers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Main : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val supplierList = listOf(
            Supplier("Fornecedor 1", "Categoria A"),
            Supplier("Fornecedor 2", "Categoria B"),
        )

        val adapter = SupplierAdapter(supplierList, this)
        recyclerView.adapter = adapter

    }
}