package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.content.Intent
import android.os.Parcelable
import org.parceler.Parcels

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

//        val message = intent.getStringExtra(EXTRA_MESSAGE)
        val parcelable = intent.getParcelableExtra<Parcelable>(EXTRA_MESSAGE)
        val user = Parcels.unwrap<JUser>(parcelable)
        val message = "${user.name} ${user.age}"

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = message
    }
}