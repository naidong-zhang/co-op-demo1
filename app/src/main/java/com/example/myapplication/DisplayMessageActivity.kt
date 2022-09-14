package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.content.Intent

class DisplayMessageActivity : AppCompatActivity() {
    companion object Message {
        const val USER_DATA = "com.example.myapplication.MESSAGE_USER"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val user = intent.getSerializableExtra(USER_DATA) as User
        val message = """
            |Name: ${user.name}
            |Phone: ${user.phone}
            |Email: ${user.email}
            |""".trimMargin()

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = message
    }
}