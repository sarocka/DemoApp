package com.example.demoapp.adapters

import android.content.Context
import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.os.persistableBundleOf
import androidx.recyclerview.widget.RecyclerView
import com.example.demoapp.ArtboardSecond
import com.example.demoapp.ArtboardThird
import com.example.demoapp.R
import com.example.demoapp.model.Product
import com.example.demoapp.model.Smanji

class SmanjiAdapter (context: Context) : RecyclerView.Adapter<SmanjiAdapter.ViewHolder>() {

    var kartice = mutableListOf<Smanji>()
    var cont= context



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      val view = LayoutInflater.from(parent.context).inflate(R.layout.smanji_row, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val images = initListOfImages()
        val listaNaslova = cont.getResources().getStringArray(R.array.smanjiLista)

       for (kartica in kartice){
          holder.naslov.text=listaNaslova[position]
           holder.slika.setImageResource(images[position])
        }
    }

    override fun getItemCount(): Int {
       return kartice.size
    }
    fun setData(newList: MutableList<Smanji>){
        kartice=newList
        notifyDataSetChanged()
    }


    fun initListOfImages() : MutableList<Int> {
        val imgView1 = R.drawable.smanji_anksioznost
        val imgView2 = R.drawable.smanji_bes
        val imgView3 = R.drawable.smanji_iritaciju
        val imgView4 = R.drawable.smanji_tugu
        val imgView5 = R.drawable.smanji_strah
        val imgView6 = R.drawable.smanji_brigu

        val images= mutableListOf<Int>(imgView1,imgView2, imgView3, imgView4, imgView5, imgView6)

        return images
    }
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var naslov: TextView = itemView.findViewById(R.id.naslov)
        var opis : TextView = itemView.findViewById(R.id.opis)
        var slika : ImageView = itemView.findViewById(R.id.imageA3)

        init {
            val listaNaslova = cont.getResources().getStringArray(R.array.smanjiLista)
            itemView.setOnClickListener {
                if (listaNaslova[position].equals("Smanji anksioznost")){
                    (cont as ArtboardThird).redirectToArtboardFourth()
                }
            }
        }


    }
}