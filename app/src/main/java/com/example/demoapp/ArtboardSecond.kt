package com.example.demoapp

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RelativeLayout
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.demoapp.adapters.ProductAdapter
import com.example.demoapp.model.Product

private lateinit var productAdapter: ProductAdapter
class ArtboardSecond : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_artboard_second)


        productAdapter= ProductAdapter(this)
        productAdapter.setData(initializeList())
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter= productAdapter
        recyclerView.layoutManager= GridLayoutManager(this, 2)
    }
    fun initializeList(): MutableList<Product>{

       val productNames = getResources().getStringArray(R.array.productNames)
        //paint.color = context.getColor(R.color.colorOnPrimary)

        val product1 = Product(R.drawable.fb_icon, productNames[0])
        val product2 = Product(R.drawable.fb_icon, productNames[1])
        val product3 = Product(R.drawable.fb_icon, productNames[2])
        val product4 = Product(R.drawable.fb_icon, productNames[3])
        val product5 = Product(R.drawable.fb_icon, productNames[4])
        val product6 = Product(R.drawable.fb_icon, productNames[5])
        val product7 = Product(R.drawable.fb_icon, productNames[6])

        //String[] some_array = getResources().getStringArray(R.array.your_string_array)

        val products = mutableListOf<Product>(product1, product2, product3, product4,product5, product6, product7)
        return products
    }
}