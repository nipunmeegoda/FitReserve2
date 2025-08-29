package com.example.fitreserve.Activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.fitreserve.R

class booking: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.booking)

        val paycancel = findViewById<Button>(R.id.CancelPay)
        paycancel.setOnClickListener {
            startActivity(Intent(this, home::class.java))
            finish()
        }

        val confirmpay  = findViewById<Button>(R.id.btnDone)
        confirmpay.setOnClickListener {
            startActivity(Intent(this, payment_confirmed::class.java))
            finish()
        }



    }
}