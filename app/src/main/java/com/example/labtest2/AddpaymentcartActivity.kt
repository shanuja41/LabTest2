package com.example.labtest2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class AddpaymentcartActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.addpaymentcart)

      // **Navigate to login**
       val makepayment = findViewById<Button>(R.id.makepayment)
        makepayment.setOnClickListener {
           val intent = Intent(this, PaymentActivity::class.java)
          startActivity(intent)
           finish()
       }
    }
}