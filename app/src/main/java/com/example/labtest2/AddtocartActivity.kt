package com.example.labtest2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
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
    }
}