package com.example.rentspotapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView

class bookmark : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bookmark)

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
                    // Already on the bookmark screen
                    true
                }

                R.id.profile -> {

                    startActivity(Intent(this, profile::class.java))
                    true
                }

                else -> false
            }
        }

// Set the selected item to the bookmark button
        bottomNavigationView.selectedItemId = R.id.bookmark

    }
}
