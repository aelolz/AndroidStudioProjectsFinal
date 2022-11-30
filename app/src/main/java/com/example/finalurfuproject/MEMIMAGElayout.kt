package com.example.finalurfuproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MEMIMAGElayout : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memimagelayout)

        val memTextView: TextView = findViewById(R.id.textViewMem)
        val imageMem: ImageView = findViewById(R.id.imageViewMem)
        val btnNewTask: Button = findViewById(R.id.btnMemNewTask)

        imageMem.setOnClickListener {
            val phrases = listOf(
                "Встаем, я есть хочу",
                "Вставай, я уронил вазу",
                "АААААА, мой лоток полон",
                "Кожанный что там по еде????",
                "Часики-то тикают",
                "Мужика-то хоть нашла себе?",
                "Не нужны мне новые друзья..."
            )

            val shuffledList = phrases.shuffled() // перемешанный список

            // Выводим в текстовые метки
            memTextView.text = shuffledList[0]
        }

        btnNewTask.setOnClickListener {
            val intent = Intent(this@MEMIMAGElayout, ToastLayout::class.java)
            startActivity(intent)
        }

    }
}