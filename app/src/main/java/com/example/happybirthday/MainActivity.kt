package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val giftBtn: Button = findViewById(R.id.giftButton)

        giftBtn.setOnClickListener {
            val giftText: TextView = findViewById(R.id.giftText)

            if (giftText.text.isNotBlank()) {

                giftText.text = ""
                giftBtn.text = "Open Gift"
            } else {
                giftText.text = "10 whoopings for 10 years!"
                giftBtn.text = "Close Gift"
            }

//            Toast.makeText(this, "Gift Button Clicked!", Toast.LENGTH_SHORT).show()
        }
    }
}