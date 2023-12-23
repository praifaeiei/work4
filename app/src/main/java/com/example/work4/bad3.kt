package com.example.work4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class bad3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bad3)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("ResultRun", 0)

        val A3: Button = findViewById(R.id.A3)
        val B3: Button = findViewById(R.id.B3)
        val C3: Button = findViewById(R.id.C3)
        val D3: Button = findViewById(R.id.D3)

        A3.setOnClickListener {
            val intent = Intent(this, bad4::class.java)
            intent.putExtra("ResultRun", numrand)
            startActivity(intent)

        }
        B3.setOnClickListener {
            val intent = Intent(this, bad4::class.java)
            intent.putExtra("ResultRun", numrand)
            startActivity(intent)
        }
        C3.setOnClickListener {
            val intent = Intent(this, bad4::class.java)
            intent.putExtra("ResultRun", numrand+1)
            startActivity(intent)
        }
        D3.setOnClickListener {
            val intent = Intent(this, bad4::class.java)
            intent.putExtra("ResultRun", numrand)
            startActivity(intent)
        }
    }
}