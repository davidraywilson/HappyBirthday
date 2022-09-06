package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.time.LocalDate
import java.time.Period
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

abstract class Person() {
    abstract val firstName: String
    abstract val lastName: String
    abstract val hairColor: String?
    abstract val favoriteColor: String
    abstract val birthDay: Int
    abstract val birthMonth: Int
    abstract val birthYear: Int

    fun fullName(): String {
        return firstName + lastName
    }

    fun calculateAge(): Int {
        val currentDate: LocalDate = LocalDate.now()
        val birthDate: LocalDate = LocalDate.parse("${formatDate(birthMonth)}-${formatDate(birthDay)}-$birthYear")
        return Period.between(birthDate, currentDate).getYears()
    }
}

//class Parent() : Person() {
//    fun getChildren(): Array {
//
//    }
//}

class Parent() : Person() {
    override val firstName = ""
    override val lastName = ""
    override val hairColor = ""
    override val favoriteColor = ""
    override val birthDay = 1
    override val birthMonth = 1
    override val birthYear = 2222

    fun getChildren() : Array<String> {
        return arrayOf("", "")
    }
}

class Child() : Person() {
    override val firstName = ""
    override val lastName = ""
    override val hairColor = ""
    override val favoriteColor = ""
    override val birthDay = 1
    override val birthMonth = 1
    override val birthYear = 2222

    val parent : Person = Parent()

    fun parentName() : String {
        return parent.fullName()
    }
}

fun formatDate(number: Int?): String {
    return String.format("%02d", number)
}
