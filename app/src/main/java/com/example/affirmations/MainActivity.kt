package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.affirmations.adapters.MovieAdapter
import com.example.affirmations.dataSource.dataSource
import com.example.affirmations.databinding.ActivityMainBinding
import javax.sql.DataSource as DataSource1

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val movies = dataSource().loadMovies()
        val adapter = MovieAdapter(this, movies, R.layout.simple_row_layout)
        binding.movieList.layoutManager = LinearLayoutManager(this)
        binding.movieList.adapter = adapter
    }
}