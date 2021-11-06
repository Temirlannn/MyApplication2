package com.itacademy.myapplication.models

import java.io.Serializable
import java.util.*
//Модель пользователя
data class User(
    //Имя пользователя
    val name:String,
    //возраст пользователя
    var age: Int,
    //пол ползователя
    var gender: Int,
    //Дата рождения пользователя
    var birtDate: Date
) : Serializable
