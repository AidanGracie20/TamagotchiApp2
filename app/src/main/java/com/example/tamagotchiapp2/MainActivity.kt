package com.example.tamagotchiapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button1 = findViewById<Button>(R.id.button1)     //declaring the button
        button1.setOnClickListener {     //making the "get started" button working
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent) }     //Code that takes the user to the second page
        }
    }






//REFERENCES FOR ENTIRE CODE    -  Module Manual (online) [4 May 2024]
//                              -  https://chatgpt.com/ (online) [4 May 2024]