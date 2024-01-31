package com.example.seminario3di2024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.temporizador)
        val countDownTimer = object : CountDownTimer(10000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                textView.text = (millisUntilFinished / 1000).toString()
            }

            override fun onFinish() {
                var newIntent = Intent(this@MainActivity, Ejercicio2::class.java)
                startActivity(newIntent)
            }
        }
        countDownTimer.start()
    }
}
