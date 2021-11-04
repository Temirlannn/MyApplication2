package com.itacademy.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var firstName: EditText
    lateinit var age: EditText
    lateinit var BirthDate: EditText

    lateinit var saveBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstName = findViewById(R.id.firstName)
        age = findViewById(R.id.age)
        BirthDate = findViewById(R.id.BirthDate)
        saveBtn = findViewById(R.id.saveBtn)

        saveBtn.setOnClickListener {
            val name = firstName.text.toString()
            val ageText = age.text.toString()
            val birth = BirthDate.text.toString()
            val intent = Intent(this,SecondActivity::class.java) // intent - путь

            intent.putExtra("firstname", name)
            intent.putExtra("age", ageText)
            intent.putExtra("BirthDate", birth)
            startActivity(intent)

        }
    }

    override fun onResume(){
        super.onResume()
        Log.i("OnResume!!!", "ВОСПРОИЗВЕДЕНИЕ!!!")
    }

    override fun onStart() {
        super.onStart()
        Log.i("OnStart!!!", "СТАРТ!!!")
    }

    override fun onPause() {
        super.onPause()
        Log.i("OnPause!!!","ПАУЗА!!!")
        Toast.makeText(this, "onPause!!!", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Log.i("OnStop!!!","СТОП!!!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("OnDestroy","Уничтожение")
    }

}