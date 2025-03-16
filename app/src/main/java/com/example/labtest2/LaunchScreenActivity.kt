package com.example.labtest2

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class LaunchScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.launchscreen)

        // Wait for 3 seconds before navigating to the Onboarding screen
        Handler(Looper.getMainLooper()).postDelayed({

//            Log.d("LaunchScreenActivity", "Navigating to OnboardingActivity")
//            Start Onboarding Activity
            val intent = Intent(this, OnboardingActivity::class.java)
            startActivity(intent)
            finish() // Optional: to finish the launch screen activity so the user can't go back to it
        }, 4000) // 4000 milliseconds = 4 seconds
    }
}
