package com.example.fitreserve.Activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.fitreserve.R

class signin: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.signin)



        val txtforgotpass = findViewById<TextView>(R.id.txtforgotpass)
        txtforgotpass.setOnClickListener {
            startActivity(Intent(this, password_reset::class.java))
            finish()
        }

        val hxtnoact= findViewById<TextView>(R.id.txtnoacc)
        hxtnoact.setOnClickListener {
            startActivity(Intent(this, signup::class.java))
            finish()
        }



        val btnin= findViewById<Button>(R.id.btnSignIn)
        btnin.setOnClickListener {
            startActivity(Intent(this, home::class.java))
            finish()
        }


    }
}