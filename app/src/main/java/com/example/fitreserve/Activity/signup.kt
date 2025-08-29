package com.example.fitreserve.Activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.fitreserve.R

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)



        val btnSignIn = findViewById<Button>(R.id.btnSignUp)
        btnSignIn.setOnClickListener {
            startActivity(Intent(this, signin::class.java))
            finish()
        }

        val txthaveacc = findViewById<TextView>(R.id.txthaveacc)
        txthaveacc.setOnClickListener {
            startActivity(Intent(this, signin::class.java))
            finish()
        }


    }
}