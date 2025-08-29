package com.example.fitreserve.Activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.fitreserve.R

class schedule_confirmed : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.schedule_confirmed)


        val bookagain = findViewById<Button>(R.id.bBook)
        bookagain.setOnClickListener {
            startActivity(Intent(this, schedule::class.java))
            finish()
        }

        val navHome = findViewById<ImageView>(R.id.navHome)
        navHome.setOnClickListener {
            startActivity(Intent(this, home::class.java))
            finish()
        }


        val navBooking = findViewById<ImageView>(R.id.navBooking)
        navBooking.setOnClickListener {
            startActivity(Intent(this, schedule::class.java))
            finish()
        }

        val navProfile = findViewById<ImageView>(R.id.navProfile)
        navProfile.setOnClickListener {
            startActivity(Intent(this, profile::class.java))
            finish()
        }




    }
}