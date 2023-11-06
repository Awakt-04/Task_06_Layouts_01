package com.example.task06_layouts_01

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LinearLayout01 : AppCompatActivity() {

    private  lateinit var boton : Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstacedState : Bundle?){
        super.onCreate(savedInstacedState)
        setContentView(R.layout.linear_layout_01)

        boton = findViewById(R.id.boton2)


        boton.setOnClickListener {
            val intent = Intent(this@LinearLayout01, MainActivity::class.java)
            startActivity(intent)
        }
    }


}