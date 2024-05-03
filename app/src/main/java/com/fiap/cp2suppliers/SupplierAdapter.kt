package com.fiap.cp2suppliers

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class SupplierAdapter(private val supplierList: List<Supplier>, private val context: Context) : RecyclerView.Adapter<SupplierAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewSupplierName: TextView = itemView.findViewById(R.id.supplier_name_list)
        val textViewSupplierCategory: TextView = itemView.findViewById(R.id.supplier_category_list)

        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val clickedSupplier = supplierList[position]
                    val intent = Intent(context, SupplierDetailsActivity::class.java).apply {
                        putExtra("name", clickedSupplier.name)
                        putExtra("category", clickedSupplier.category)
                    }
                    context.startActivity(intent)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.supplier_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val supplier = supplierList[position]
        holder.textViewSupplierName.text = supplier.name
        holder.textViewSupplierCategory.text = supplier.category
    }

    override fun getItemCount(): Int {
        return supplierList.size
    }
}