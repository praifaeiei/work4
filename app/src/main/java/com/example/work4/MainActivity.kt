package com.example.work4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val A1: Button = findViewById(R.id.A1)
        val B1: Button = findViewById(R.id.B1)
        val C1: Button = findViewById(R.id.C1)
        val D1: Button = findViewById(R.id.D1)

        var numrand: Int = 0

        A1.setOnClickListener {
            val intent = Intent(this, bad2::class.java)
            intent.putExtra("ResultRun", numrand+1)
            startActivity(intent)

        }
        B1.setOnClickListener {
            val intent = Intent(this, bad2::class.java)
            intent.putExtra("ResultRun", numrand)
            startActivity(intent)
        }
        C1.setOnClickListener {
            val intent = Intent(this, bad2::class.java)
            intent.putExtra("ResultRun", numrand)
            startActivity(intent)
        }
        D1.setOnClickListener {
            val intent = Intent(this, bad2::class.java)
            intent.putExtra("ResultRun", numrand)
            startActivity(intent)
        }
    }
}