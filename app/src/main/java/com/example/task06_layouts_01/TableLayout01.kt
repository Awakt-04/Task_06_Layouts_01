package com.example.task06_layouts_01

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TableLayout01 : AppCompatActivity() {

    private  lateinit var boton : Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstacedState : Bundle?){
        super.onCreate(savedInstacedState)
        setContentView(R.layout.table_layout_01)

        boton = findViewById(R.id.boton3)

        boton.setOnClickListener {
            val intent = Intent(this@TableLayout01, MainActivity::class.java)
            startActivity(intent)
        }
    }

}