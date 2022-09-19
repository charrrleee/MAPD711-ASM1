package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //defining an intent object
        val intent = intent

        //getting values from previous activity using intent object
        val nameMsg = intent.getStringExtra("name")
        val addressMsg = intent.getStringExtra("address")
        val professionMsg = intent.getStringExtra("profession")
        val dreamJobMsg = intent.getStringExtra("dreamJob")
        val favouriteFoodMsg = intent.getStringExtra("favouriteFood")

        //defining a java object for text view control
        val name = findViewById<TextView>(R.id.tv_name_input)
        val address = findViewById<TextView>(R.id.tv_address_input)
        val profession = findViewById<TextView>(R.id.tv_profession_input)
        val dreamJob = findViewById<TextView>(R.id.tv_dream_job_input)
        val favouriteFood = findViewById<TextView>(R.id.tv_favourite_food_input)

        //assigning message value to textview control
        name.text = nameMsg
        address.text = addressMsg
        profession.text = professionMsg
        dreamJob.text = dreamJobMsg
        favouriteFood.text = favouriteFoodMsg

    }
}