package com.example.labtest2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.ComponentActivity

@SuppressLint("CustomSplashScreen")
class LaunchScreenActivity : ComponentActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.launchscreen)

        // Wait for 3 seconds before navigating to the Onboarding screen
        Handler(Looper.getMainLooper()).postDelayed({

            val intent = Intent(this, OnboardingActivity::class.java)
            startActivity(intent)
            finish()
        }, 4000)
    }
}


