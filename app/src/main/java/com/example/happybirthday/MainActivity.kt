package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

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
                val gift = Gift()
                val openedGift = gift.openGift()
                giftText.text = "You opened a $openedGift!"
                giftBtn.text = "Close Gift"
            }

//            Toast.makeText(this, "Gift Button Clicked!", Toast.LENGTH_SHORT).show()
        }
    }
}

class Gift() {
    private val choices: Array<String> = arrayOf("Kinder Egg", "LOL Doll", "Barbie Doll")

    fun openGift(): String {
        val randomIndex = Random.nextInt(choices.size);
        return choices[randomIndex]
    }
}
