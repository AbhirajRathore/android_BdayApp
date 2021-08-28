package com.abhiraj.birthdaynewgr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun createBirthdayCard(view: android.view.View) {
        val intent = Intent(this ,Birthdayop::class.java)
        startActivity(intent)
        val nameInput = findViewById<EditText>(R.id.nameInput)
        val name = nameInput.editableText.toString()
        Toast.makeText( this ,"name is $name", Toast.LENGTH_LONG ).show()
        intent.putExtra("name",name)
        startActivity(intent)
    }
}