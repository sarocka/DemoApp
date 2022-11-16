package com.example.demoapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.demoapp.R
import com.example.demoapp.model.Product

class ProductAdapter (context: Context) : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    var products = mutableListOf<Product>()
    var cont= context



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      val view = LayoutInflater.from(parent.context).inflate(R.layout.product_row, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//list of colors
        /*
        #376a7d
        #444770
        #604c4d
        #3a6961
        #87464c
        #48454e
        #2f496a

         */
        holder.product_name.text = products[position].name
        for (product in products){
          //  holder.cardView.setBackgroundColor(R.color.)
        }

    }

    override fun getItemCount(): Int {
       return products.size
    }
    fun setData(newList: MutableList<Product>){
        products=newList
        notifyDataSetChanged()
    }
    fun initListOfColors(){

    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var product_image: ImageView = itemView.findViewById(R.id.productImg)
        var product_name : TextView = itemView.findViewById(R.id.productName)
        var cardView: CardView = itemView.findViewById(R.id.cardViewA2)
    }
}