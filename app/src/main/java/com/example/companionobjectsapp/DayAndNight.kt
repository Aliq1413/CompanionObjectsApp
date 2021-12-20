package com.example.companionobjectsapp

import android.content.Context
import android.view.View
import android.widget.Toast

class DayAndNight(private  val  context:Context) {
    companion object  {
        const val dayBg = R.drawable.day
        const val nightBg = R.drawable.night

    }
    fun setImage(layout: View, dayOrNight:String ){
        when (dayOrNight){
            "Day" -> {
                layout.setBackgroundResource(dayBg)
            }
            "Night" ->{
                layout.setBackgroundResource(nightBg)
            }

        else -> {
            Toast.makeText(context, "Please Enter day or night !!", Toast.LENGTH_SHORT).show()
        }
        }
    }
}