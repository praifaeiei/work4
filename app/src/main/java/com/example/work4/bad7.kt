package com.example.work4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class bad7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bad7)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("ResultRun", 0)

        val A7: Button = findViewById(R.id.A7)
        val B7: Button = findViewById(R.id.B7)
        val C7: Button = findViewById(R.id.C7)
        val D7: Button = findViewById(R.id.D7)


        A7.setOnClickListener {
            val intent = Intent(this, bad8::class.java)
            intent.putExtra("ResultRun", numrand)
            startActivity(intent)

        }
        B7.setOnClickListener {
            val intent = Intent(this, bad8::class.java)
            intent.putExtra("ResultRun", numrand)
            startActivity(intent)
        }
        C7.setOnClickListener {
            val intent = Intent(this, bad8::class.java)
            intent.putExtra("ResultRun", numrand+1)
            startActivity(intent)
        }
        D7.setOnClickListener {
            val intent = Intent(this, bad8::class.java)
            intent.putExtra("ResultRun", numrand)
            startActivity(intent)
        }
    }
}