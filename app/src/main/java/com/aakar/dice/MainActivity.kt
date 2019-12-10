package com.aakar.dice

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_btn)

        rollButton.text="Let's Roll"
        rollButton.setOnClickListener {
            Toast.makeText(this,"Rolling Dice",Toast.LENGTH_SHORT).show()
            rolldice()


        }
    }

    private fun rolldice()
    {
        val imgview1 : ImageView = findViewById(R.id.roll_img1)
        val imgview2 : ImageView = findViewById(R.id.roll_img2)
        var randomint1= (1 until 7).random()
        val drawableResource1 = when (randomint1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        imgview1.setImageResource(drawableResource1)
        val randomint2= (1 until 7).random()
        val drawableResource2 = when (randomint2) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        imgview2.setImageResource(drawableResource2)
        var mediaplayer= MediaPlayer.create(this, R.raw.rolldice)
        mediaplayer.start()

    }
}
