package com.example.rentspotapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class loginsign : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginsign)

        findViewById<Button>(R.id.btnlogin).setOnClickListener {
            startActivity(Intent(this, login::class.java))
        }
        findViewById<Button>(R.id.btnregister).setOnClickListener {
            startActivity(Intent(this, signup::class.java))
        }
    }
}