package com.example.task06_layouts_01

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ConstraintLayout02 : AppCompatActivity() {

    private  lateinit var boton : Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstacedState : Bundle?){
        super.onCreate(savedInstacedState)
        setContentView(R.layout.constraint_layout_02)

        boton = findViewById(R.id.boton6)

        boton.setOnClickListener {
            val intent = Intent(this@ConstraintLayout02, MainActivity::class.java)
            startActivity(intent)
        }
    }
}