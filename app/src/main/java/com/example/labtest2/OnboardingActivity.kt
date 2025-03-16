package com.example.labtest2

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OnboardingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding1) // Link to your onboarding1screen.xml

        val onboardingButton: Button = findViewById(R.id.onboarding1_btn)
        onboardingButton.setOnClickListener {
            // Handle button click and navigate to next screen or home activity
            // Example:
            // val intent = Intent(this, NextActivity::class.java)
            // startActivity(intent)
            // finish()
        }
    }
}
