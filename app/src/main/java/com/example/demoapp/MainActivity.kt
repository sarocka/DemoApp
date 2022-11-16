package com.example.demoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
     private lateinit var signInBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //btn_signIn
        signInBtn=findViewById(R.id.btn_signIn)
        signInBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, ArtboardSecond::class.java)
            startActivity(intent)
        }

    }
}