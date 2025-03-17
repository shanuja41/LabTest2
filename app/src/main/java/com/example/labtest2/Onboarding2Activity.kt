package com.example.labtest2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class Onboarding2Activity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onbording2)

        // **Navigate to onboarding3**
        val onboarding2btn = findViewById<Button>(R.id.onboarding2_btn)
        onboarding2btn.setOnClickListener {
            val intent = Intent(this, Onboarding3Activity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
