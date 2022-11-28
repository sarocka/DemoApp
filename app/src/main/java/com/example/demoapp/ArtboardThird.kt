package com.example.demoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.demoapp.adapters.ProductAdapter
import com.example.demoapp.adapters.SmanjiAdapter
import com.example.demoapp.model.Product
import com.example.demoapp.model.Smanji
import com.google.android.material.bottomnavigation.BottomNavigationView

private lateinit var smanjiAdapter: SmanjiAdapter
//private lateinit var bottomNavigation: BottomNavigationView
private lateinit var recyclerView: RecyclerView

class ArtboardThird : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_artboard_third)

        //adapter
        smanjiAdapter = SmanjiAdapter(this)
        smanjiAdapter.setData(initializeListOfCards())

        //recyclerview
        recyclerView = findViewById<RecyclerView>(R.id.recyclerViewA3)
        recyclerView.adapter = smanjiAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        //textview vezbe disanja
    }
    fun initializeListOfCards(): MutableList<Smanji> {
        val kartica1 = Smanji()
        val kartica2 = Smanji()
        val kartica3 = Smanji()
        val kartica4 = Smanji()
        val kartica5 = Smanji()
        val kartica6 = Smanji()

        val kartice = mutableListOf<Smanji>(
            kartica1,
            kartica2,
            kartica3,
            kartica4,
            kartica5,
            kartica6
        )
        return kartice
    }

    fun redirectToArtboardFourth() {
        val intent=Intent(this@ArtboardThird,ArtboardFourth::class.java)
        startActivity(intent)
    }
}