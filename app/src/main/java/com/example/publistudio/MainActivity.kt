package com.example.publistudio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.publistudio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListeners()
    }

    private fun initListeners() {
        val bannerIntent = Intent(this, Banner::class.java)
        binding.btBanner.setOnClickListener { startActivity(bannerIntent) }
    }
}