package com.example.fitreserve.Activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.fitreserve.R

class onboarding1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding1)

        // directing to Onboarding3
        val btnContinue = findViewById<Button>(R.id.btncontinue)
        btnContinue.setOnClickListener {
            startActivity(Intent(this, onboarding3::class.java))
            finish()
        }

    }
}