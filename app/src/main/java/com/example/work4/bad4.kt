package com.example.work4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class bad4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bad4)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("ResultRun", 0)

        val A4: Button = findViewById(R.id.A4)
        val B4: Button = findViewById(R.id.B4)
        val C4: Button = findViewById(R.id.C4)
        val D4: Button = findViewById(R.id.D4)

        A4.setOnClickListener {
            val intent = Intent(this, bad5::class.java)
            intent.putExtra("ResultRun", numrand)
            startActivity(intent)

        }
        B4.setOnClickListener {
            val intent = Intent(this, bad5::class.java)
            intent.putExtra("ResultRun", numrand)
            startActivity(intent)
        }
        C4.setOnClickListener {
            val intent = Intent(this, bad5::class.java)
            intent.putExtra("ResultRun", numrand)
            startActivity(intent)
        }
        D4.setOnClickListener {
            val intent = Intent(this, bad5::class.java)
            intent.putExtra("ResultRun", numrand+1)
            startActivity(intent)
        }
    }
}

