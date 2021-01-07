package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //roll button
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {rollDice()}
        rollDice()

        //reset button
        val resetButton: Button = findViewById(R.id.resetButton)
        resetButton.setOnClickListener {resetDice()}
        resetDice()
    }

    private fun rollDice() {
        //create 6 dice
        val dice = Dice(6)
        val diceRoll = dice.roll()
        
        //update text in screen
        val diceImage : ImageView = findViewById(R.id.imageView)
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)

        diceImage.contentDescription = diceRoll.toString()

    }

    private fun resetDice(){
        //reset dice to 0
        val diceImage: ImageView = findViewById(R.id.imageView)
        val drawableResource = R.drawable.empty_dice

        diceImage.setImageResource(drawableResource)


    }
}

class Dice(val numSides: Int){
    fun roll(): Int{
        return (1..numSides).random()
    }
}