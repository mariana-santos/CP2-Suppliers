package com.fiap.cp2suppliers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SupplierDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_supplier_details)

        val name = intent.getStringExtra("name")
        val category = intent.getStringExtra("category")

        val bundle = Bundle()
        bundle.putString("name", name)
        bundle.putString("category", category)

        val fragment = FragmentSupplierDetails()
        fragment.arguments = bundle

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }

}