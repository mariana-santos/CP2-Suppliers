package com.fiap.cp2suppliers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SupplierDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_supplier_details)

        val name = intent.getStringExtra("name")
        val category = intent.getStringExtra("category")
        val score = intent.getIntExtra("score", 0)

        val bundle = Bundle()
        bundle.putString("name", name)
        bundle.putString("category", category)
        bundle.putInt("score", score)

        val fragment = FragmentSupplierDetails()
        fragment.arguments = bundle

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()

        val btnBackHome = findViewById<Button>(R.id.backHome)
        val btnBackList = findViewById<Button>(R.id.backList)

        btnBackHome.setOnClickListener {
            val intent = Intent(this, Main::class.java)
            startActivity(intent)
            finish()
        }

        btnBackList.setOnClickListener {
            val intent = Intent(this, SupplierListActivity::class.java)
            val bundle = Bundle()
            bundle.putString("category", category)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }

}