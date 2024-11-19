package com.example.rentspotapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView

class postad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_postad)

        findViewById<Button>(R.id.button13).setOnClickListener {
            startActivity(Intent(this, location::class.java))
         }

        // Initialize bottom navigation view
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.home -> {
                    // Handle home item selection if needed
                    startActivity(Intent(this, homepageannex::class.java))
                    true
                }
                R.id.post_ad -> {
                    // Already on the post ad screen
                    true
                }
                R.id.bookmark -> {

                    startActivity(Intent(this, bookmark::class.java))
                    true
                }
                R.id.profile -> {

                    startActivity(Intent(this, profile::class.java))
                    true
                }
                else -> false
            }
        }

// Set the selected item to the post ad button
        bottomNavigationView.selectedItemId = R.id.post_ad
    }
}