package com.example.assignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get submit button
        val btn = findViewById<Button>(R.id.btn_submit)

        //defining a button click event
        btn.setOnClickListener {
            //java reference object for edit text control
            val name = findViewById<EditText>(R.id.et_name)
            val address = findViewById<EditText>(R.id.et_address)
            val profession = findViewById<EditText>(R.id.et_profession)
            val dreamJob = findViewById<EditText>(R.id.et_dream_job)
            val favouriteFood = findViewById<EditText>(R.id.et_favourite_food)

            //creating an intent object using both first and second activities.
            val intent = Intent(this@MainActivity, MainActivity2::class.java)

            //getting value from edit text and assign into intent object using key and values pairs
            intent.putExtra("name", name.text.toString())
            intent.putExtra("address", address.text.toString())
            intent.putExtra("profession", profession.text.toString())
            intent.putExtra("dreamJob", dreamJob.text.toString())
            intent.putExtra("favouriteFood", favouriteFood.text.toString())

            // starting sub activity
            startActivity(intent)

        }

    }
}