package com.fiap.cp2suppliers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Main : AppCompatActivity() {

//    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, SupplierItem())
            .commit()
    }
}