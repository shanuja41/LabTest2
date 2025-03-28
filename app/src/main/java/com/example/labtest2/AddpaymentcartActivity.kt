package com.example.labtest2

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity

class AddpaymentcartActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.addpaymentcart)

        // Navigate to PaymentActivity
        val makepayment = findViewById<Button>(R.id.makepayment)
        makepayment.setOnClickListener {
            val intent = Intent(this, PaymentActivity::class.java)
            startActivity(intent)
            finish() // Closes current activity
        }

        val backbtn2 = findViewById<ImageView>(R.id.addback)
        backbtn2.setOnClickListener {
            val intent = Intent(this, AddshippingaddressActivity::class.java)
            startActivity(intent)
            finish() // Closes current activity
        }



    }
}
