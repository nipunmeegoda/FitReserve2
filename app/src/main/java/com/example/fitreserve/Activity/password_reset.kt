package com.example.fitreserve.Activity

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.fitreserve.R

class password_reset: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.password_reset)

        val btnreset = findViewById<TextView>(R.id.btnreset)
        btnreset.setOnClickListener {
            startActivity(Intent(this, signin::class.java))
            finish()
        }

        val ert = findViewById<TextView>(R.id.txtcancel)
        ert.setOnClickListener {
            startActivity(Intent(this, signin::class.java))
            finish()
        }
    }
}