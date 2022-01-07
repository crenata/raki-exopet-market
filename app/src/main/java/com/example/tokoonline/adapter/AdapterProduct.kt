package com.example.tokoonline.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.tokoonline.R
import com.example.tokoonline.activities.DetailActivity
import com.example.tokoonline.model.Product

class AdapterProduct(private var dataList: ArrayList<Product>, private var context: Context) : RecyclerView.Adapter<AdapterProduct.Holder>() {
    class Holder(view: View) : RecyclerView.ViewHolder(view) {
        val card: CardView = view.findViewById(R.id.card)
        val tvNama: TextView = view.findViewById(R.id.tv_nama)
        val tvHarga: TextView = view.findViewById(R.id.tv_harga)
        val imgProduk: ImageView = view.findViewById(R.id.img_produk)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_produk, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.tvNama.text = dataList[position].nama
        holder.tvHarga.text = dataList[position].harga
        holder.imgProduk.setImageResource(dataList[position].gambar)
        holder.card.setOnClickListener {
            val intent: Intent = Intent(context, DetailActivity::class.java).apply {
                putExtra("name", dataList[position].nama)
                putExtra("price", dataList[position].harga)
                putExtra("venom", dataList[position].venom)
                putExtra("size", dataList[position].size)
                putExtra("sex", dataList[position].sex)
                putExtra("desc", dataList[position].desc)
                putExtra("image", dataList[position].gambar)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}