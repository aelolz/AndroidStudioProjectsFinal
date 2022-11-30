package com.example.finalurfuproject

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var _nextLayoutMain: Button
    private lateinit var _textViewMain: TextView
    private lateinit var _images: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        _textViewMain = findViewById(R.id.textViewMainActivity)
        _nextLayoutMain = findViewById(R.id.NextLayoutMainActivity)
        _images = findViewById(R.id.imgMainActivity)

        _nextLayoutMain.setOnClickListener {
            val intent = Intent(this@MainActivity, NewLayout::class.java)
            startActivity(intent)
        }

    }


}