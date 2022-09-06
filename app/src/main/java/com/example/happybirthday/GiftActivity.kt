package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class GiftActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gift)

        val giftBtn: Button = findViewById(R.id.giftButton)

        giftBtn.setOnClickListener {
            val giftText: TextView = findViewById(R.id.giftText)

            if (giftText.text.isNotBlank()) {
                giftText.text = ""
                giftBtn.text = "Open Gift"
            } else {
                val gift = Gift()
                val openedGift = gift.openGift()
                giftText.text = "You opened $openedGift!"
                giftBtn.text = "Close Gift"
            }
        }
    }
}

class Gift() {
    private val choices: Array<String> = arrayOf("a Kinder Egg", "an LOL Doll", "a Hershey Candy Bar", "a Baby Bottle Pop", "an Italian Cream Soda")

    fun openGift(): String {
        val randomIndex = Random.nextInt(choices.size);
        return choices[randomIndex]
    }
}
