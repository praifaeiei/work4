package com.example.work4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class bad5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bad5)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("ResultRun", 0)

        val A5: Button = findViewById(R.id.A5)
        val B5: Button = findViewById(R.id.B5)
        val C5: Button = findViewById(R.id.C5)
        val D5: Button = findViewById(R.id.D5)

        A5.setOnClickListener {
            val intent = Intent(this, bad6::class.java)
            intent.putExtra("ResultRun", numrand+1)
            startActivity(intent)

        }
        B5.setOnClickListener {
            val intent = Intent(this, bad6::class.java)
            intent.putExtra("ResultRun", numrand)
            startActivity(intent)
        }
        C5.setOnClickListener {
            val intent = Intent(this, bad6::class.java)
            intent.putExtra("ResultRun", numrand)
            startActivity(intent)
        }
        D5.setOnClickListener {
            val intent = Intent(this, bad6::class.java)
            intent.putExtra("ResultRun", numrand)
            startActivity(intent)
        }
    }
}
