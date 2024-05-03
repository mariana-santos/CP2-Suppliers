package com.fiap.cp2suppliers

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.fiap.cp2suppliers.databinding.ActivityMainBinding

class FragmentSupplierDetails : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_supplier_details, container, false)

        val name = arguments?.getString("name")
        val category = arguments?.getString("category")
        val score = arguments?.getInt("score")

        val nameTextView = view.findViewById<TextView>(R.id.supplier_name)
        val categoryTextView = view.findViewById<TextView>(R.id.supplier_category)
        val scoreTextView = view.findViewById<TextView>(R.id.supplier_score)

        nameTextView.text = name
        categoryTextView.text = category
        scoreTextView.text = "Nota do fornecedor: ${score}/10"

        return view
    }
}