package com.itacademy.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val  firstName = intent.getStringExtra("firstName")
        val  age= intent.getStringExtra("age")
        val  BirthDate = intent.getStringExtra( "BirthDate")
        Log.i("FirstName", firstName!!)
        Log.i("age", age!!)
        Log.i("BirthDate", BirthDate!!)

    }
}
