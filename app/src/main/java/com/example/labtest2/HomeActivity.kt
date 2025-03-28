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

        val user_btn = findViewById<ImageView>(R.id.userbtn)
        user_btn.setOnClickListener {
            val intent = Intent(this, UserprofileActivity::class.java)
            startActivity(intent)
            finish()
        }

        val orderbtn = findViewById<ImageView>(R.id.orderbtn)
        orderbtn.setOnClickListener {
            val intent = Intent(this, OrderdetailsActivity::class.java)
            startActivity(intent)
            finish()
        }

        val cartbtn = findViewById<ImageView>(R.id.cartbtn)
        cartbtn.setOnClickListener {
            val intent = Intent(this, AddtocartActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}