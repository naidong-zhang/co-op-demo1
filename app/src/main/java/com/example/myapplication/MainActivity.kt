package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import org.parceler.Parcel
import org.parceler.Parcels

const val EXTRA_MESSAGE = "com.example.myapplication.MESSAGE"



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View) {
        val user = User("John dow", 26)
        val parcelable = Parcels.wrap(user)

//        val editText = findViewById<EditText>(R.id.editTextPersonName)
//        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java)
//        intent.putExtra(EXTRA_MESSAGE, message)
        intent.putExtra(EXTRA_MESSAGE, parcelable)


        startActivity(intent)
    }
}