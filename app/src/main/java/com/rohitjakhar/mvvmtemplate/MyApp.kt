package com.rohitjakhar.mvvmtemplate

import android.app.Application
import com.google.android.gms.ads.MobileAds
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase
import com.google.firebase.ktx.initialize
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()

        Firebase.initialize(this)
        MobileAds.initialize(this)
        FirebaseAnalytics.getInstance(this)
            .setAnalyticsCollectionEnabled(!BuildConfig.DEBUG)
    }
}
