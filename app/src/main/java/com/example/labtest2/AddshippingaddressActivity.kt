package com.example.labtest2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity

class AddshippingaddressActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.addshippingaddress)

      // **Navigate to login**
       val shipbtn= findViewById<Button>(R.id.shipbtn)
        shipbtn.setOnClickListener {
           val intent = Intent(this, AddpaymentcartActivity::class.java)
          startActivity(intent)
           finish()
       }

        val addressbtn = findViewById<ImageView>(R.id.addressbtn)
        addressbtn.setOnClickListener {
            val intent = Intent(this, AddtocartActivity::class.java)
            startActivity(intent)
            finish() // Closes current activity
        }

    }
}