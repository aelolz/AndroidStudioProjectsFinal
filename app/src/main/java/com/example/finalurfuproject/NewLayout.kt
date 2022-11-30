package com.example.finalurfuproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class NewLayout : AppCompatActivity() {

    private lateinit var _getText: EditText
    private lateinit var _textView: TextView
    private lateinit var _btn: Button
    private lateinit var _btnNextLayout1: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_layout)

        _getText = findViewById(R.id.HelloCat)
        _textView = findViewById(R.id.AnswerCatTextVIEW)
        _btn = findViewById(R.id.btnHelloCat)
        _btnNextLayout1 = findViewById(R.id.NextLayoutCountBird)

        _btn.setOnClickListener {
            if(_getText.text.isEmpty()) {
                _textView.text = "Вы не поздоровались с котом"
            } else {
                _textView.text = "Привет, " + _getText.text
            }
        }

        _btnNextLayout1.setOnClickListener {
            val intent = Intent(this@NewLayout, CountBirdLayout::class.java)
            startActivity(intent)
        }

    }
}


