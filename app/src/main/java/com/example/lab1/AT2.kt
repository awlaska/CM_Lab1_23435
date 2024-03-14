package com.example.lab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AT2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_at2)

        val buttonClick = findViewById<Button>(R.id.button2_click)
        buttonClick.setOnClickListener {
            finish()
            System.exit(0)
        }
    }
}