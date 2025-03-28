package com.example.labtest2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity

class HomeActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

      // **Navigate to login**
       val burger_btn = findViewById<ImageView>(R.id.burger)
        burger_btn.setOnClickListener {
           val intent = Intent(this, SelectfoodActivity::class.java)
          startActivity(intent)
           finish()
       }
    }
}