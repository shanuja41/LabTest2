package com.example.labtest2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity

class AddtocartActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.addtocart)


       val placeorder= findViewById<Button>(R.id.placeorder)
        placeorder.setOnClickListener {
           val intent = Intent(this, AddshippingaddressActivity::class.java)
          startActivity(intent)
           finish()
       }



        val  cartback = findViewById<ImageView>(R.id.cartback)
        cartback.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish() // Closes current activity
        }

    }
}