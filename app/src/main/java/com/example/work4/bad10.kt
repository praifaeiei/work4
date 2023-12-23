package com.example.work4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class bad10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bad10)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("ResultRun", 0)

        val A10: Button = findViewById(R.id.A10)
        val B10: Button = findViewById(R.id.B10)
        val C10: Button = findViewById(R.id.C10)
        val D10: Button = findViewById(R.id.D10)


        A10.setOnClickListener {
            val intent = Intent(this, Final::class.java)
            intent.putExtra("ResultRun", numrand)
            startActivity(intent)

        }
        B10.setOnClickListener {
            val intent = Intent(this, Final::class.java)
            intent.putExtra("ResultRun", numrand+1)
            startActivity(intent)
        }
        C10.setOnClickListener {
            val intent = Intent(this, Final::class.java)
            intent.putExtra("ResultRun", numrand)
            startActivity(intent)
        }
        D10.setOnClickListener {
            val intent = Intent(this, Final::class.java)
            intent.putExtra("ResultRun", numrand)
            startActivity(intent)
        }
    }
}