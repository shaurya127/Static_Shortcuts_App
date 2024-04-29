package com.example.staticshortcuts


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)

        btn1.setOnClickListener {
            startActivity(Intent(this, Activity1::class.java))
        }
        btn2.setOnClickListener {
            startActivity(Intent(this, Activity2::class.java))
        }
        btn3.setOnClickListener {
            startActivity(Intent(this, Activity3::class.java))
        }

    }
}
