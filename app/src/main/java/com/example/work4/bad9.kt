package com.example.work4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class bad9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bad9)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("ResultRun", 0)

        val A9: Button = findViewById(R.id.A9)
        val B9: Button = findViewById(R.id.B9)
        val C9: Button = findViewById(R.id.C9)
        val D9: Button = findViewById(R.id.D9)


        A9.setOnClickListener {
            val intent = Intent(this, bad10::class.java)
            intent.putExtra("ResultRun", numrand)
            startActivity(intent)

        }
        B9.setOnClickListener {
            val intent = Intent(this, bad10::class.java)
            intent.putExtra("ResultRun", numrand)
            startActivity(intent)
        }
        C9.setOnClickListener {
            val intent = Intent(this, bad10::class.java)
            intent.putExtra("ResultRun", numrand)
            startActivity(intent)
        }
        D9.setOnClickListener {
            val intent = Intent(this, bad10::class.java)
            intent.putExtra("ResultRun", numrand+1)
            startActivity(intent)
        }
    }
}