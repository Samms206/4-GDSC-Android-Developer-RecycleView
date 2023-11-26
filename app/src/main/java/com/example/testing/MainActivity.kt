package com.example.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val item1 = findViewById<Button>(R.id.button)
        item1.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, FormActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Pergi ke FormActivity", Toast.LENGTH_SHORT).show()
        })
    }
}