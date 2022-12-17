package com.example.findmyageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        buFindAge.setOnClickListener {
         you can also write the same code of buFindAgeEvent here
         or can set the OnClick Property of the button to this function
        }
        */

    }

    fun buFindAgeEvent(view: View) {
        //fire when button is clicked
        val userDOB:String = txtYearOfBirth.text.toString()
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        if(userDOB.toInt()==0 || userDOB.toInt()>currentYear){
            tvShowAge.text = "Invalid Input"
            return
        }
        val myAge = currentYear - userDOB.toInt()
        tvShowAge.text = "Your age is $myAge years"
    }
}