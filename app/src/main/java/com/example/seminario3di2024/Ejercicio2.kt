package com.example.seminario3di2024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.ImageView

class Ejercicio2 : AppCompatActivity() {
    private lateinit var countDown: CountDownTimer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio2)
        countDown=object:CountDownTimer(0,1000){
            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {

            }
        }

    }

    fun onClick(view: View) {
        if (view.id == R.id.carta1) {
            var carta = findViewById<ImageView>(R.id.carta1)
            carta.setImageResource(R.drawable.partealante)
            countDown(carta)
        } else if (view.id == R.id.carta2) {
            var carta = findViewById<ImageView>(R.id.carta2)
            carta.setImageResource(R.drawable.partealante)
            countDown(carta)
        } else if (view.id == R.id.carta3) {
            var carta = findViewById<ImageView>(R.id.carta3)
            carta.setImageResource(R.drawable.partealante)
            countDown(carta)
        }
    }

    fun countDown(card: ImageView){
        object : CountDownTimer(1000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
             }

            override fun onFinish() {
                card.setImageResource(R.drawable.parteatras)
            }
        }.start()
    }

    fun ejercicio3(view: View) {
        val newIntent = Intent(this, Ejercicio3::class.java)
        startActivity(newIntent)
    }
}