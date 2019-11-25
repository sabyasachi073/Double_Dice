package com.example.doubledice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val diceRoll1:Button = findViewById(R.id.button)
        val diceRoll2:Button = findViewById(R.id.button2)

        val Result:Int = 0

        diceRoll1.setOnClickListener {
            Result = dice1()
        }

        diceRoll2.setOnClickListener {
            dice2()
        }

        val total:TextView = findViewById(R.id.textView)
//        total.text = diceResult1 + diceResult2).toString()
    }

    private fun dice1():Int
    {
        val randomVal = Random().nextInt(6) + 1

        val diceImg =  when(randomVal){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }

        val diceImage:ImageView =findViewById(R.id.imageView)
        diceImage.setImageResource(diceImg)

        return randomVal
    }

    private fun dice2():Int
    {
        val randomVal = Random().nextInt(6) + 1

        val diceImg =  when(randomVal){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }

        val diceImage:ImageView =findViewById(R.id.imageView2)
        diceImage.setImageResource(diceImg)

        return randomVal
    }

}
