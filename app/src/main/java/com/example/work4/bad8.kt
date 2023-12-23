package com.example.work4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class bad8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bad8)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("ResultRun", 0)

        val A8: Button = findViewById(R.id.A8)
        val B8: Button = findViewById(R.id.B8)
        val C8: Button = findViewById(R.id.C8)
        val D8: Button = findViewById(R.id.D8)


        A8.setOnClickListener {
            val intent = Intent(this, bad9::class.java)
            intent.putExtra("ResultRun", numrand)
            startActivity(intent)

        }
        B8.setOnClickListener {
            val intent = Intent(this, bad9::class.java)
            intent.putExtra("ResultRun", numrand)
            startActivity(intent)
        }
        C8.setOnClickListener {
            val intent = Intent(this, bad9::class.java)
            intent.putExtra("ResultRun", numrand+1)
            startActivity(intent)
        }
        D8.setOnClickListener {
            val intent = Intent(this, bad9::class.java)
            intent.putExtra("ResultRun", numrand)
            startActivity(intent)
        }
    }
}