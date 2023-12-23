package com.example.work4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Final : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        val total: TextView = findViewById(R.id.ResultRun)
        val receivedIntent = intent
        val numrand = receivedIntent.getIntExtra("ResultRun", 0)
        total.setText(numrand.toString())
    }
}