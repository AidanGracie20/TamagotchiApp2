package com.example.tamagotchiapp2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar

class MainActivity3 : AppCompatActivity() {
    private lateinit var progressBar: ProgressBar     //code for the progress bar
    private lateinit var button: Button
    private var progressValue = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        progressBar = findViewById(R.id.progressbarf)  //declarations
        button = findViewById(R.id.fbutton2)
        
        button.setOnClickListener {     //code to get the button to work
            if (progressValue < 100) {         //code for progress bar
                progressValue += 20
                progressBar.progress = progressValue

            }
            var bbutton2 = findViewById<Button>(R.id.bbutton2)
            bbutton2.setOnClickListener {
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent) }  //code that declares, gets the button to work and gets the button to take you back a page
        }
    }
}