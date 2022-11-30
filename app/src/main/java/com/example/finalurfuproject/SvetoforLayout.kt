package com.example.finalurfuproject

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class SvetoforLayout : AppCompatActivity() {

    private lateinit var _textView: TextView
    private lateinit var _btnGreen: Button
    private lateinit var _btnYellow: Button
    private lateinit var _btnRed: Button

    private lateinit var _btnNextLayout: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_svetofor_layout)

        val rootLayout: ConstraintLayout = findViewById(R.id.svetoforConstraintLayout)

        _textView = findViewById(R.id.textViewSvetofor)
        _btnGreen = findViewById(R.id.btnGreenSvetofor)
        _btnYellow = findViewById(R.id.btnYellowSvetofor)
        _btnRed = findViewById(R.id.btnRedSvetofor)

        _btnNextLayout = findViewById(R.id.btnNextLayoutSvetofor)


        _btnGreen.setOnClickListener {
            _textView.text = "Цвет светоформа --> Зеленый"
            rootLayout.setBackgroundColor(Color.GREEN)
        }

        _btnYellow.setOnClickListener {
            _textView.text = "Цвет светоформа --> Желтый"
            rootLayout.setBackgroundColor(Color.YELLOW)
        }

        _btnRed.setOnClickListener {
            _textView.text = "Цвет светоформа --> Красный"
            rootLayout.setBackgroundColor(Color.RED)
        }

        _btnNextLayout.setOnClickListener {
            val intent = Intent(this@SvetoforLayout, MEMIMAGElayout::class.java)
            startActivity(intent)
        }
    }
}