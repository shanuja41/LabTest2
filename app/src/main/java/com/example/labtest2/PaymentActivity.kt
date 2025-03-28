package com.example.labtest2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity

class PaymentActivity: ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.payment)

      // **Navigate to login**
       val confirmorder = findViewById<Button>(R.id.confirmorder)
        confirmorder.setOnClickListener {
           val intent = Intent(this, PaymentsuccessfulActivity::class.java)
          startActivity(intent)
           finish()
       }

        val paymentbtn = findViewById<ImageView>(R.id.paymentbtn)
        paymentbtn.setOnClickListener {
            val intent = Intent(this, AddpaymentcartActivity::class.java)
            startActivity(intent)
            finish() // Closes current activity
        }
    }
}