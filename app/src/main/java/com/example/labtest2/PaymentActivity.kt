package com.example.labtest2

import android.os.Bundle
import androidx.activity.ComponentActivity

class PaymentActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.payment)

//      // **Navigate to login**
//       val getstartedbtn = findViewById<Button>(R.id.getstarted_btn)
//      getstartedbtn.setOnClickListener {
//           val intent = Intent(this, SignupActivity::class.java)
//          startActivity(intent)
//           finish()
//       }
    }
}