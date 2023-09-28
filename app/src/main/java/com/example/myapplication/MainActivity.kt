package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : Activity() {

    lateinit var buttonAbrir: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAbrir = findViewById(R.id.button_abrir)
        buttonAbrir.setOnClickListener{

            val intent = Intent(this, DetalhesActivity::class.java)

            startActivity(intent)
        }
    }
}