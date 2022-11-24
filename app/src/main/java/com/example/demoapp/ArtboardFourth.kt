package com.example.demoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class ArtboardFourth : AppCompatActivity() {
    private lateinit var backArrow:ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_artboard_fourth)

        backArrow= findViewById(R.id.backArrow)

        backArrow.setOnClickListener {
            val intent= Intent(this@ArtboardFourth, ArtboardThird::class.java)
            startActivity(intent)
        }


    }
}