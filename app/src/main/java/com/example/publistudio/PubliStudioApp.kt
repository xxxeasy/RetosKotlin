package com.example.publistudio

import android.app.Application
import com.google.android.gms.ads.MobileAds

class PubliStudioApp:Application() {

    override fun onCreate() {
        super.onCreate()
        MobileAds.initialize(this)
    }
}