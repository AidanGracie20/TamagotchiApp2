package com.example.tamagotchiapp2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar

class MainActivity4 : AppCompatActivity() {
    private lateinit var progressBar: ProgressBar  //progress bar code
    private lateinit var button: Button
    private var progressValue = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        var progressBar = findViewById<ProgressBar>(R.id.progressbarp)    //declarations
        var button = findViewById<Button>(R.id.pbutton2)    //progress bar  code
        button.setOnClickListener {
            if (progressValue < 100) {     //progress bar  code
                progressValue += 20
                progressBar.progress = progressValue
            }

            var bbutton3 = findViewById<Button>(R.id.bbutton3)
            bbutton3.setOnClickListener {
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)  //code that declares, gets the button to work and gets the button to take you back a page
            }
        }
    }
}