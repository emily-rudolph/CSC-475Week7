package com.example.week7criticalthinking

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.core.content.ContentProviderCompat.requireContext
import com.example.week7criticalthinking.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalculateMeters.setOnClickListener {
            val feet = binding.getFeet.text.toString()

            try {
                val doubleF = feet.toDouble()
                val meters = CalculateMeters.calculateMeters(doubleF)
                val s = String.format("%.3f", meters)
                binding.textMetersAnswer.text = s

            } catch(e: Exception) {
                Warning(this, "Please Enter A Single Number Value!")
                Log.d("Calculate Kelvin", e.toString())
                return@setOnClickListener
            }

        }

        binding.buttonCalculateKelvin.setOnClickListener {
            val fahrenheit = binding.getFahrenheit.text.toString()

            try {
                val doubleF = fahrenheit.toDouble()
                val kelvin = CalculateKelvin.calculateKelvin(doubleF)
                val s = String.format("%.3f", kelvin)
                binding.textKelvinAnswer.text = s

            } catch(e: Exception) {
                Warning(this, "Please Enter A Single Number Value!")
                Log.d("Calculate Kelvin", e.toString())
                return@setOnClickListener
            }

        }

        binding.buttonCalculateKilograms.setOnClickListener {
            val pounds = binding.getPounds.text.toString()

            try {
                val doubleP = pounds.toDouble()
                val kilograms = CalculateKilograms.calculateKilograms(doubleP)
                val s = String.format("%.3f", kilograms)
                binding.textKilogramsAnswer.text = s

            } catch(e: Exception) {
                Warning(this, "Please Enter A Single Number Value!")
                Log.d("Calculate Kilograms", e.toString())
                return@setOnClickListener
            }

        }
    }
}