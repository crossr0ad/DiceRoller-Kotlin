package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

/**
 * This activity arrows the user to roll two dices and view the result on the screen.
 **/
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    /**
     * Roll the two dices and update the screen with the result.
     */
    private fun rollDice() {
        val dice = Dice(6)
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = dice.roll().toString()

        val dice2 = Dice(6)
        val resultTextView2: TextView = findViewById(R.id.textView2)
        resultTextView2.text = dice2.roll().toString()
    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}
