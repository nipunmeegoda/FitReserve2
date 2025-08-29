package com.example.fitreserve.Activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.fitreserve.R
import android.widget.ImageView


class home: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        val bt1 = findViewById<Button>(R.id.btngetnow1)
        bt1.setOnClickListener {
            startActivity(Intent(this, booking::class.java))
             finish()
        }

        val bt2 = findViewById<Button>(R.id.btnGetNow2)
        bt2.setOnClickListener {
            startActivity(Intent(this, booking::class.java))
            finish()
        }

        val bt3 = findViewById<Button>(R.id.btnGetNow3)
        bt3.setOnClickListener {
            startActivity(Intent(this, booking::class.java))
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



