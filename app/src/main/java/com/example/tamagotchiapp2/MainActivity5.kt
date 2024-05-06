package com.example.tamagotchiapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar

class MainActivity5 : AppCompatActivity() {
    private lateinit var progressBar: ProgressBar  //progress bar code
    private lateinit var button: Button
    private var progressValue = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        var progressBar = findViewById<ProgressBar>(R.id.progressbarc)  //declarations
        var button = findViewById<Button>(R.id.cbutton2)
        button.setOnClickListener {
            if (progressValue < 100) {      //progress bar code
                progressValue += 20
                progressBar.progress = progressValue
            }

            var bbutton4 = findViewById<Button>(R.id.bbutton4)
            bbutton4.setOnClickListener {
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)  //code that declares, gets the button to work and gets the button to take you back a page
            }
        }


    }
}
