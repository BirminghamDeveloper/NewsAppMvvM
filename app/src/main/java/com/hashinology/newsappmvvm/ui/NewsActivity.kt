package com.hashinology.newsappmvvm.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.hashinology.newsappmvvm.R

class NewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
//        val newsNavHostFragment = findViewById<NavHostFragment>(R.id.newsNavHostFragment)
        val navController = Navigation.findNavController(this, R.id.newsNavHostFragment)
        bottomNavigationView.setupWithNavController(navController)
    }
}