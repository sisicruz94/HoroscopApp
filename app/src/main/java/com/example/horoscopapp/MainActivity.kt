package com.example.horoscopapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.horoscopapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    //Creamos un navigation controller que es la clase padre que gestiona todo el tema de navegacion
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //creamos metodo que llama a otro métodos
        initUI()

    }

    private fun initUI() {
        initNavigation()
    }

    private fun initNavigation() {
        //Para hacer los controles de navegacion
        val navHost:NavHostFragment = supportFragmentManager.findFragmentById(R.id.FragmenContainerView) as NavHostFragment
        navController = navHost.navController
        binding.buttonNavView.setupWithNavController(navController)
    }
}