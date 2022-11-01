package com.example.affirmations.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.models.Movie
import kotlinx.coroutines.NonDisposableHandle
import kotlinx.coroutines.NonDisposableHandle.parent

//step1: create a holder inside adapter
//step2: create a constructor of adapter
// 3: implement onCreateViewHolder
// 4: implemenr getItemViewCount

class MovieAdapter(
    private val context: Context,
    private val movies: List<Movie>,
    private val layoutResId: Int
) : RecyclerView.Adapter<MovieAdapter.MovieHolder>() {
    class MovieHolder(
        private val itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        private val textMovie: TextView = itemView.findViewById(R.id.movieText)
        fun bind(movie: Movie) {
            textMovie.setText(movie.MovieResID)
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieHolder {
        val view = LayoutInflater.from(context).inflate(layoutResId, parent, false)
        return MovieHolder(view)
    }

    override fun onBindViewHolder(holder: MovieHolder, position: Int) {

        holder.bind(movies[position])
    }

    override fun getItemCount() = movies.size
}