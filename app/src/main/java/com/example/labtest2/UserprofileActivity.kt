package com.example.labtest2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity

class UserprofileActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.userprofile)

      // **Navigate to login**
       val personalinfo = findViewById<TextView>(R.id.personalinfo)
        personalinfo.setOnClickListener {
           val intent = Intent(this, Editprofile::class.java)
          startActivity(intent)
           finish()
       }

        val logout = findViewById<TextView>(R.id.logout)
        logout.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }


        val backbtn4 = findViewById<ImageView>(R.id.profileback2)
        backbtn4.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}