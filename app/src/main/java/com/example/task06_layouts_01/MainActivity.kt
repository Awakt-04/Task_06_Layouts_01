package com.example.task06_layouts_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var linearLayoutButton1 : Button
    private lateinit var linearLayoutButton2 : Button
    private lateinit var tableLayoutButton1 : Button
    private lateinit var tableLayoutButton2 : Button
    private lateinit var constraintLayoutButton1 : Button
    private lateinit var constraintLayoutButton2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        linearLayoutButton1 = findViewById(R.id.linearLayoutButton1)
        linearLayoutButton2 = findViewById(R.id.linearLayoutButton2)
        tableLayoutButton1 = findViewById(R.id.tableLayoutButton1)
        tableLayoutButton2 = findViewById(R.id.tableLayoutButton2)
        constraintLayoutButton1 = findViewById(R.id.constraintLayoutButton1)
        constraintLayoutButton2 = findViewById(R.id.constraintLayoutButton2)

        linearLayoutButton1.setOnClickListener{
            val intent = Intent(this@MainActivity, LinearLayout01::class.java)
            startActivity(intent)
        }

        linearLayoutButton2.setOnClickListener{
            val intent = Intent(this@MainActivity, LinearLayout02::class.java)
            startActivity(intent)
        }

        tableLayoutButton1.setOnClickListener{
            val intent = Intent(this@MainActivity, TableLayout01::class.java)
            startActivity(intent)
        }

        tableLayoutButton2.setOnClickListener{
            val intent = Intent(this@MainActivity, TableLayout02::class.java)
            startActivity(intent)
        }

        constraintLayoutButton1.setOnClickListener{
            val intent = Intent(this@MainActivity, ConstraintLayout01::class.java)
            startActivity(intent)
        }

        constraintLayoutButton2.setOnClickListener{
            val intent = Intent(this@MainActivity, ConstraintLayout02::class.java)
            startActivity(intent)
        }

    }
}