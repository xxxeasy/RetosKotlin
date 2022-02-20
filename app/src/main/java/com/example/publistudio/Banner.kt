package com.example.publistudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.publistudio.databinding.ActivityBannerBinding
import com.google.android.gms.ads.AdRequest

class Banner : AppCompatActivity() {
    private lateinit var binding: ActivityBannerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBannerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initLoadAds()
    }

    private fun initLoadAds() {
        val adRequest = AdRequest.Builder().build()
        binding.banner.loadAd(adRequest)
    }
}