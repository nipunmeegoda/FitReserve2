package com.example.fitreserve.Activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.fitreserve.R

class onboarding3: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.onboarding3)

        val btnGetStarted = findViewById<Button>(R.id.btnGetStarted)
        btnGetStarted.setOnClickListener {
            startActivity(Intent(this, signup::class.java))
            // finish() // optional if you don't want to return to Onboarding1
        }

        val btnOnboardingSignIn = findViewById<Button>(R.id.btnOnboardingSignIn)
        btnOnboardingSignIn.setOnClickListener {
            startActivity(Intent(this, signin::class.java))
            // finish() // optional if you don't want to return to Onboarding1
        }



    }
}
