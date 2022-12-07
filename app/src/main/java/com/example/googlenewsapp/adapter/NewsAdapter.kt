package com.example.googlenewsapp.adapter

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.googlenewsapp.R
import com.example.googlenewsapp.databinding.RecyclerviewRowBinding
import com.example.googlenewsapp.model.NewsModel
import kotlinx.android.synthetic.main.recyclerview_row.view.*

class NewsAdapter(private val newsList: ArrayList<NewsModel>): RecyclerView.Adapter<NewsAdapter.NewsViewHolder>(),NewsClickListener {
    inner class NewsViewHolder(var view: RecyclerviewRowBinding): RecyclerView.ViewHolder(view.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val inflater= LayoutInflater.from(parent.context)
        val view= DataBindingUtil.inflate<RecyclerviewRowBinding>(inflater,R.layout.recyclerview_row,parent,false)
        return NewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.view.news = newsList[position]
        holder.view.listener=this
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    fun updateList(newNewsList: List<NewsModel>){
        newsList.clear()
        newsList.addAll(newNewsList)
        notifyDataSetChanged()
    }

    override fun onNewsClicked(v: View) {
        v?.let {
            val url=v.newUrl.text.toString()
            val urlIntent= Intent(Intent.ACTION_VIEW,Uri.parse(url))
            v.context.startActivity(urlIntent)
        }

    }


}
