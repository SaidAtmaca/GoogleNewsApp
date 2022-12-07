package com.example.googlenewsapp.adapter

import android.app.Activity
import android.view.View
import androidx.fragment.app.Fragment
import com.example.googlenewsapp.view.FeedFragment
import kotlinx.android.synthetic.main.recyclerview_row.view.*

interface NewsClickListener {

    fun onNewsClicked(v:View)
}