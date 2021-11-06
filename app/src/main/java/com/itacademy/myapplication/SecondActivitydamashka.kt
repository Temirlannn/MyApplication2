package com.itacademy.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton

class SecondActivitydamashka : AppCompatActivity() {

    lateinit var textfirstNAme2:EditText
    lateinit var textsecondName:EditText

    lateinit var btnknopka:ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        textfirstNAme2 = findViewById(R.id.firstname2)
        textsecondName = findViewById(R.id.secondName)
        btnknopka = findViewById(R.id.btnknopka)


        val firstNAme2 = intent.getStringExtra("NAME")
        val secondName = intent.getStringExtra("MAMA")

        btnknopka.setOnClickListener{
            onBackPressed()
        }





        setContentView(R.layout.activity_second_activitydamashka)

    }
}