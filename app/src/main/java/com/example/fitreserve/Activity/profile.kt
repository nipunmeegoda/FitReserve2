package com.example.fitreserve.Activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.fitreserve.R

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)


        val reservecancel = findViewById<Button>(R.id.btnCancelresrve)
        reservecancel.setOnClickListener {
            startActivity(Intent(this, schedule::class.java))
            finish()
        }


        val logout = findViewById<Button>(R.id.btnLogout)
        logout.setOnClickListener {
            startActivity(Intent(this, signin::class.java))
            finish()
        }

        val navProfile = findViewById<ImageView>(R.id.navProfile)
        navProfile.setOnClickListener {
            startActivity(Intent(this, profile::class.java))
            finish()
        }


        val navBooking = findViewById<ImageView>(R.id.navBooking)
        navBooking.setOnClickListener {
            startActivity(Intent(this, schedule::class.java))
            finish()
        }

        val pdirect = findViewById<ImageView>(R.id.navProfile)
        pdirect.setOnClickListener {
            startActivity(Intent(this, profile::class.java))
            finish()
        }





    }


}