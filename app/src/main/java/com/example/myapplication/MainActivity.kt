package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View) {
        val name = findViewById<EditText>(R.id.editTextPersonName).text.toString()
        val phone = findViewById<EditText>(R.id.editTextPhone).text.toString()
        val email = findViewById<EditText>(R.id.editTextEmail).text.toString()
        val user = User(name, phone, email)

        val intent = Intent(this, DisplayMessageActivity::class.java)
        intent.putExtra(DisplayMessageActivity.USER_DATA, user)

        startActivity(intent)
    }
}