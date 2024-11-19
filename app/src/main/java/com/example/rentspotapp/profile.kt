package com.example.rentspotapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        findViewById<Button>(R.id.button36).setOnClickListener {
            startActivity(Intent(this, login::class.java))
        }

        // Initialize bottom navigation view
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        // Set listener for bottom navigation view item selection
        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.home -> {
                    // Handle home item selection if needed
                    startActivity(Intent(this, homepageannex::class.java))
                    true
                }
                R.id.post_ad -> {

                    startActivity(Intent(this, postad::class.java))
                    true
                }
                R.id.bookmark -> {

                    startActivity(Intent(this, bookmark::class.java))
                    true
                }
                R.id.profile -> {
                    // Already on the profile screen
                    true
                }
                else -> false
            }
        }

// Set the selected item to the profile button
        bottomNavigationView.selectedItemId = R.id.profile
    }
}