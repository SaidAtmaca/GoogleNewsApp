package com.example.googlenewsapp.view


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.googlenewsapp.R
import com.example.googlenewsapp.adapter.NewsAdapter
import com.example.googlenewsapp.viewmodel.FeedViewModel
import kotlinx.android.synthetic.main.fragment_feed.*


class FeedFragment : Fragment() {

    private lateinit var viewModel: FeedViewModel
    private val newsAdapter=NewsAdapter(arrayListOf())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_feed, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel=ViewModelProvider(this).get(FeedViewModel::class.java)
        viewModel.refreshNews()

        recyclerView.layoutManager=LinearLayoutManager(context)
        recyclerView.adapter=newsAdapter

        swipeRefreshLayout.setOnRefreshListener {
            recyclerView.visibility=View.GONE
            errorMessage.visibility=View.GONE
            progressBar.visibility=View.GONE
            viewModel.refreshNews()
            swipeRefreshLayout.isRefreshing=false
        }

        observeLiveData()
    }

    fun observeLiveData(){
        viewModel.news.observe(viewLifecycleOwner, Observer {
            it?.let {
                recyclerView.visibility=View.VISIBLE
                newsAdapter.updateList(it)
            }
        })

        viewModel.newsError.observe(viewLifecycleOwner, Observer {
            it?.let {
                if(it){
                    errorMessage.visibility=View.VISIBLE
                }else{
                    errorMessage.visibility=View.GONE
                }
            }
        })

        viewModel.newsLoading.observe(viewLifecycleOwner, Observer {
                it?.let {
                    if(it){
                        progressBar.visibility=View.VISIBLE
                        recyclerView.visibility=View.GONE
                        errorMessage.visibility=View.GONE
                    }else{
                        progressBar.visibility=View.GONE
                    }
                }
        })
    }

}