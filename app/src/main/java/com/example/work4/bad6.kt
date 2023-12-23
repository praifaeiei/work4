package com.example.work4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class bad6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bad6)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("ResultRun", 0)

        val A6: Button = findViewById(R.id.A6)
        val B6: Button = findViewById(R.id.B6)
        val C6: Button = findViewById(R.id.C6)
        val D6: Button = findViewById(R.id.D6)


        A6.setOnClickListener {
            val intent = Intent(this, bad7::class.java)
            intent.putExtra("ResultRun", numrand)
            startActivity(intent)

        }
        B6.setOnClickListener {
            val intent = Intent(this, bad7::class.java)
            intent.putExtra("ResultRun", numrand)
            startActivity(intent)
        }
        C6.setOnClickListener {
            val intent = Intent(this, bad7::class.java)
            intent.putExtra("ResultRun", numrand)
            startActivity(intent)
        }
        D6.setOnClickListener {
            val intent = Intent(this, bad7::class.java)
            intent.putExtra("ResultRun", numrand+1)
            startActivity(intent)
        }
    }
}