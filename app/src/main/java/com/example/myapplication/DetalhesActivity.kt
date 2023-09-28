package com.example.myapplication

import android.app.Activity
import android.os.Bundle
import android.widget.Button

class DetalhesActivity : Activity() {

    lateinit var buttonFechar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        buttonFechar = findViewById(R.id.button_fechar)
        buttonFechar.setOnClickListener{
            finish()
        }
    }
}