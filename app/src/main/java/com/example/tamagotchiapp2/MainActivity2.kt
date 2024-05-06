package com.example.tamagotchiapp2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var fbutton = findViewById<Button>(R.id.fbutton)   //declaring all the Buttons
        fbutton.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent) }       //code that results in each button taking you too a new
                                            //page, for example "feed" button will take you to feed page

        var pbutton = findViewById<Button>(R.id.pbutton)
        pbutton.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent) }

        var cbutton = findViewById<Button>(R.id.cbutton)
        cbutton.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent) }

        var bbutton = findViewById<Button>(R.id.bbutton)
        bbutton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent) }
    }
        }
