package com.fiap.cp2suppliers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class FragmentSupplierDetails : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_supplier_details, container, false)

        val name = arguments?.getString("name")
        val category = arguments?.getString("category")

        val nameTextView = view.findViewById<TextView>(R.id.supplier_name)
        val categoryTextView = view.findViewById<TextView>(R.id.supplier_category)

        nameTextView.text = name
        categoryTextView.text = category

        return view
    }
}