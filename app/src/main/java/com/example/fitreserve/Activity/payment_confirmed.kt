package com.example.fitreserve.Activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.fitreserve.R


class payment_confirmed:  AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.payment_confirmed)


        val backHome = findViewById<Button>(R.id.bBook)
        backHome.setOnClickListener {
            startActivity(Intent(this, home::class.java))
            finish()
        }

        val schbook = findViewById<Button>(R.id.bsession)
        schbook.setOnClickListener {
            startActivity(Intent(this, schedule::class.java))
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