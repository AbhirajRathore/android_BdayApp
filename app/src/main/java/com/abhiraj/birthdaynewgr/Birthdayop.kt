package com.abhiraj.birthdaynewgr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Birthdayop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthdayop)
        val name = intent.getStringExtra("name")
        val birthdayGreeting = findViewById<TextView>(R.id.birthdayGreeting)
        birthdayGreeting.text = "happy Birthday $name"
    }
}