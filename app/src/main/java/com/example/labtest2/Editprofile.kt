package com.example.labtest2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class Editprofile : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.editprofile)

      // **Navigate to login**
       val savebtn = findViewById<Button>(R.id.savebtn)
       savebtn.setOnClickListener {
           val intent = Intent(this, UserprofileActivity::class.java)
          startActivity(intent)
           finish()
       }
    }
}