package com.example.bonus

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.bonus.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        setSupportActionBar(binding.toolbar)


        val navController = binding.navHostFragment.getFragment<androidx.navigation.fragment.NavHostFragment>().navController


        setupActionBarWithNavController(navController)


        binding.bottomNavigation.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = binding.navHostFragment.getFragment<androidx.navigation.fragment.NavHostFragment>().navController
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}
