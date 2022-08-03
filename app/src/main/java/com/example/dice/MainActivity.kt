package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollBtu : Button = findViewById(R.id.btn_roll)
        val numTxt : TextView = findViewById(R.id.txt_number)


        rollBtu.setOnClickListener{
            val toast = Toast.makeText(this,"hello there!", Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}