package com.example.motion_reycyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupActionBarWithNavController(findNavController(R.id.fragment))

    }

    override fun onSupportNavigateUp(): Boolean {
        val navigation = findNavController(R.id.fragment)
        return super.onSupportNavigateUp() || navigation.navigateUp()
    }
}