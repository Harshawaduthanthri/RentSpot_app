package com.example.rentspotapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView

class annexdetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_annexdetails)

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
                    // Handle postad item selection if needed
                    startActivity(Intent(this, postad::class.java))
                    true
                }
                R.id.bookmark -> {
                    // Handle bookmark item selection if needed
                    startActivity(Intent(this, bookmark::class.java))
                    true
                }
                R.id.profile -> {
                    // Start Profile activity when profile item is selected
                    startActivity(Intent(this, profile::class.java))
                    true
                }
                else -> false
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.bottom_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.home -> {
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
                startActivity(Intent(this, profile::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}