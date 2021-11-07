package com.itacademy.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.itacademy.myapplication.models.User

class MainActivity2 : AppCompatActivity() {
    lateinit var firstName2: EditText
    lateinit var secondName: EditText

    lateinit var btnName: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        firstName2 = findViewById(R.id.firstname2)
        secondName = findViewById(R.id.secondName)
        btnName = findViewById(R.id.btnName)

        btnName.setOnClickListener {
            val name = firstName2.text.toString()
            val name2 = secondName.text.toString()
            val intent = Intent(this,SecondActivitydamashka::class.java)
            intent.putExtra("NAME",name)
            intent.putExtra("MAMA",name2)

            // 2 вариант,
            //val user: User = User (name,surname, phone, password, birtDate)
            //intent.putExtra(name:"USER", user)


            startActivity(intent)

        }
    }
}