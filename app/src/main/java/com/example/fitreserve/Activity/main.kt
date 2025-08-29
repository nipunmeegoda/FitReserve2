package com.example.fitreserve.Activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.fitreserve.R

class main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        // Tap anywhere on splash screen to go to Onboarding
        findViewById<View>(R.id.splash).setOnClickListener {
            startActivity(Intent(this, onboarding1::class.java))
            finish() // prevents going back to splash


        }
    }
}
