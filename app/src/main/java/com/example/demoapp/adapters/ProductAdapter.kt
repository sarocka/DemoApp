package com.example.demoapp.adapters

import android.content.Context
import android.graphics.Color
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

   val cardColors = initListOfColors()
        val images = initListOfImages()
        holder.product_name.text = products[position].name

        for (product in products){
          holder.cardView.setCardBackgroundColor(cardColors[position])
            holder.product_image.setImageResource(images[position])
        }
    }

    override fun getItemCount(): Int {
       return products.size
    }
    fun setData(newList: MutableList<Product>){
        products=newList
        notifyDataSetChanged()
    }
    fun initListOfColors() : MutableList<Int> {
        val colorCardView1 = Color.parseColor("#376a7d")
        val colorCardView2 = Color.parseColor("#444770")
        val colorCardView3 = Color.parseColor("#604c4d")
        val colorCardView4 = Color.parseColor("#3a6961")
        val colorCardView5 = Color.parseColor("#87464c")
        val colorCardView6 = Color.parseColor("#48454e")
        val colorCardView7 = Color.parseColor("#2f496a")

        val colors= mutableListOf<Int>(colorCardView1, colorCardView2, colorCardView3, colorCardView4, colorCardView5, colorCardView6, colorCardView7)

        return colors

    }

    fun initListOfImages() : MutableList<Int> {
        val imgView1 = R.drawable.vezbe_disanja
        val imgView2 = R.drawable.meditacija
        val imgView3 = R.drawable.problem_sa_spavanjem
        val imgView4 = R.drawable.zakazi_psihoterapeuta // ovo
        val imgView5 = R.drawable.pozovi_psihologa //ovo
        val imgView6 = R.drawable.pozovi_pravnu_pomoc //ovo
        val imgView7 = R.drawable.pitaj_psihologa//ovo*/

        val images= mutableListOf<Int>(imgView1,imgView2, imgView3, imgView4, imgView5, imgView6, imgView7)

        return images

    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var product_image: ImageView = itemView.findViewById(R.id.productImg)
        var product_name : TextView = itemView.findViewById(R.id.productName)
        var cardView: CardView = itemView.findViewById(R.id.cardViewA2)
    }
}