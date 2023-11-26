package com.example.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        val item1 = findViewById<Button>(R.id.btn_send)
        item1.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Tombol di klik", Toast.LENGTH_SHORT).show()
        })

        val recycleview = findViewById<RecyclerView>(R.id.rv_movie)
        val adapter = MovieAdapter(movieData.listMovie)
        recycleview.setHasFixedSize(true)
        recycleview.layoutManager = LinearLayoutManager(this)
        recycleview.adapter = adapter

        adapter.setOnItemClickCallback(object : MovieAdapter.OnItemClickCallback {
            override fun onItemClicked(data: movies) {
                val intent = Intent(this@FormActivity, DetailMovieActivity::class.java)
                intent.putExtra("movieName", data.name)
                intent.putExtra("movieImage", data.image)
                intent.putExtra("movieDesc", data.description)
                startActivity(intent)
            }
        })

    }
}