package com.example.rentspotapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView

class homepageannex : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepageannex)

        findViewById<Button>(R.id.btnboardingtp).setOnClickListener {
            startActivity(Intent(this, homepageboarding::class.java))
        }

        findViewById<Button>(R.id.button9).setOnClickListener {
            startActivity(Intent(this, annexdetails::class.java))
        }

        findViewById<Button>(R.id.button4).setOnClickListener {
            startActivity(Intent(this, location::class.java))
        }

        // Initialize bottom navigation view
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.home -> {
                    // Already on the home screen
                    true
                }
                R.id.post_ad -> {
                    // Handle postad item selection if needed
                    startActivity(Intent(this, postad::class.java))
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

// Set the selected item to the home button
        bottomNavigationView.selectedItemId = R.id.home
    }
}

