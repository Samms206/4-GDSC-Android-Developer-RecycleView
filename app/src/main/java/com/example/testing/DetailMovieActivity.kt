package com.example.testing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailMovieActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movie)
        val name = intent.getStringExtra("movieName")
        val description = intent.getStringExtra("movieDesc")
        val image =  intent.getIntExtra("movieImage", 0)

        val title = findViewById<TextView>(R.id.tv_title)
        val desc = findViewById<TextView>(R.id.tv_desc)
        val img_banner = findViewById<ImageView>(R.id.img_views)

        title.text = name
        desc.text = description
        img_banner.setImageResource(image)

    }
}