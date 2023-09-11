package com.example.practiceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addPost: Button = findViewById(R.id.add_post)
        addPost.setOnClickListener {
            val intent = Intent(this, AddPostActivity::class.java)
            // start your next activity
            startActivity(intent)
        }
    }
}