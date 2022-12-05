package com.example.googlenewsapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.googlenewsapp.R
import com.example.googlenewsapp.model.NewsModel

class NewsAdapter(private val newsList: ArrayList<NewsModel>): RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {
    inner class NewsViewHolder(var view: View): RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val inflater= LayoutInflater.from(parent.context)
        val view= inflater.inflate(R.layout.recyclerview_row,parent,false)
        return NewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return newsList.size
    }


}

/* val inflater = LayoutInflater.from(parent.context)
    val view= inflater.inflate(R.layout.recyclerview_row,parent,false)
    return NewsViewHolder(view) */