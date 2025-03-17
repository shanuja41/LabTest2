package com.example.labtest2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class Onboarding3Activity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onbording3)

        // **Navigate to getstarted
        val onboarding3btn = findViewById<Button>(R.id.onboarding3_btn)
        onboarding3btn.setOnClickListener {
            val intent = Intent(this, GetstartedActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
