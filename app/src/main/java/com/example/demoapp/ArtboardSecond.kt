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

        //adapter
        productAdapter= ProductAdapter(this)
       productAdapter.setData(initializeList())
        //recyclerview
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter= productAdapter
        recyclerView.layoutManager= GridLayoutManager(this, 2)
    }
    fun initializeList(): MutableList<Product> {
        val product1 = Product()
        val product2 = Product()
        val product3 = Product()
        val product4 = Product()
        val product5 = Product()
        val product6 = Product()
        val product7 = Product()

        val products = mutableListOf<Product>(product1, product2, product3, product4,product5, product6, product7)
        return products
    }

}