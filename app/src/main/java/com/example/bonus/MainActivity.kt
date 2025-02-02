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

        // Установка Toolbar в качестве ActionBar
        setSupportActionBar(binding.toolbar)

        // Получаем NavController
        val navController = binding.navHostFragment.getFragment<androidx.navigation.fragment.NavHostFragment>().navController

        // Настраиваем ActionBar с NavController
        setupActionBarWithNavController(navController)

        // Настраиваем нижнюю навигацию с NavController
        binding.bottomNavigation.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = binding.navHostFragment.getFragment<androidx.navigation.fragment.NavHostFragment>().navController
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}
