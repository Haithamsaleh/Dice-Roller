package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.VideoView

import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollBtu : Button = findViewById(R.id.btn_roll)


        rollBtu.setOnClickListener{
//            val toast = Toast.makeText(this,"hello there!!", Toast.LENGTH_SHORT)
//            toast.show()
            rollDice()
        }
    }

private fun rollDice(){
//val dice = Dice(6)
//    val numTxt : TextView = findViewById(R.id.txt_number)
//    numTxt.text = dice.roll().toString()
    val dice = Dice(6)
    val diceRoll = dice.roll()
    val diceImage: ImageView = findViewById(R.id.imageView)
    val diceved: VideoView = findViewById(R.id.videoView)

    when (diceRoll) {
        1 -> diceImage.setImageResource(R.drawable.dice_1)
        2 -> diceImage.setImageResource(R.drawable.dice_2)
        3 -> diceImage.setImageResource(R.drawable.dice_3)
        4 -> diceImage.setImageResource(R.drawable.dice_4)
        5 -> diceImage.setImageResource(R.drawable.dice_5)
        6 -> diceImage.setImageResource(R.drawable.dice_6)
    }}

//    fun roll(): Int {
//        // generate a random number between 1 and 6
//        return (1..6).random()
//    }
}
