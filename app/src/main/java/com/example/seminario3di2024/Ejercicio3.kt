package com.example.seminario3di2024
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.ImageView

class Ejercicio3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio3)

        val semaforo = findViewById<ImageView>(R.id.semaforo)
        val countDownTimer = object : CountDownTimer(3000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                when {
                    millisUntilFinished > 2000 -> {
                        semaforo.setImageResource(R.drawable.semaforo_verde)
                    }
                    millisUntilFinished > 1000 -> {
                        semaforo.setImageResource(R.drawable.semaforo_amarillo)
                    }
                    else -> {
                        semaforo.setImageResource(R.drawable.semaforo_rojo)
                    }
                }
            }

            override fun onFinish() {
                this.start() // Restart the countdown
            }
        }
        countDownTimer.start()
    }
}
