package com.example.work4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class bad2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bad2)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("ResultRun", 0)

        val A2: Button = findViewById(R.id.A2)
        val B2: Button = findViewById(R.id.B2)
        val C2: Button = findViewById(R.id.C2)
        val D2: Button = findViewById(R.id.D2)

        A2.setOnClickListener {
            val intent = Intent(this, bad3::class.java)
            intent.putExtra("ResultRun", numrand)
            startActivity(intent)

        }
        B2.setOnClickListener {
            val intent = Intent(this, bad3::class.java)
            intent.putExtra("ResultRun", numrand)
            startActivity(intent)
        }
        C2.setOnClickListener {
            val intent = Intent(this, bad3::class.java)
            intent.putExtra("ResultRun", numrand+1)
            startActivity(intent)
        }
        D2.setOnClickListener {
            val intent = Intent(this, bad3::class.java)
            intent.putExtra("ResultRun", numrand)
            startActivity(intent)
        }
    }
}