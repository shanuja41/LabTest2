package com.example.labtest2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class SelectfoodActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.selectfood)

      // **Navigate to login**
        val addtobtn = findViewById<Button>(R.id.addto)
        addtobtn.setOnClickListener {
            val intent = Intent(this, AddtocartActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}