package com.example.ex6
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.b1)

        button.setOnClickListener{
            Toast.makeText(this, "boto apretat", Toast.LENGTH_SHORT).show()
        }
    }
}