package com.example.finalurfuproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class CountBirdLayout : AppCompatActivity() {

    private lateinit var _textViewCountBird:      TextView
    private lateinit var _btnHello:      Button
    private lateinit var _btnCountBird:  Button
    private lateinit var _btnNextLayout: Button

    private var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count_bird_layout)

        _textViewCountBird = findViewById(R.id.helloandcountbirdTextViev)
        _btnHello = findViewById(R.id.btnHelloWithUser_CountBirdTask)
        _btnCountBird = findViewById(R.id.btnCountBird)

        _btnNextLayout = findViewById(R.id.btnNextLayoutFromCountBird)


        _btnHello.setOnClickListener {
            _textViewCountBird.text = "Привет пользователь"
        }

        _btnCountBird.setOnClickListener {
            _textViewCountBird.text = "Я насчитал ${++counter} ворон"
        }

        _btnNextLayout.setOnClickListener {
            val intent = Intent(this@CountBirdLayout, SvetoforLayout::class.java)
            startActivity(intent)
        }

    }
}