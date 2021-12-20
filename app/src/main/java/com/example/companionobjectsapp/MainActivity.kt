package com.example.companionobjectsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    lateinit var  constraintLayout: ConstraintLayout
    lateinit var labelTv:TextView
    lateinit var edText:EditText
    lateinit var changeBtn :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = " "
        constraintLayout = findViewById(R.id.main)
        labelTv = findViewById(R.id.tV)
        edText = findViewById(R.id.dayNight)
        changeBtn = findViewById(R.id.btnChange)
        changeBtn.setOnClickListener {
            val dayAndNight = DayAndNight(this)
            dayAndNight.setImage(constraintLayout, edText.text.toString())
        }
    }
}