package com.example.googlenewsapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.googlenewsapp.model.GeneralModel
import com.example.googlenewsapp.model.NewsModel
import com.example.googlenewsapp.service.NewsApiService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class FeedViewModel: ViewModel() {

    private val newsApiService= NewsApiService()
    private val disposable= CompositeDisposable()

    val news= MutableLiveData<List<NewsModel>>()
    val newsError=MutableLiveData<Boolean>()
    val newsLoading=MutableLiveData<Boolean>()

    fun refreshNews(){
        newsLoading.value=true

        getDataFromApi()




    }

    private fun getDataFromApi(){

        disposable.add(
            newsApiService.getData()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object: DisposableSingleObserver<GeneralModel>(){
                    override fun onSuccess(t: GeneralModel) {
                        news.value=t.articles
                        newsError.value=false
                        newsLoading.value=false
                    }

                    override fun onError(e: Throwable) {
                        newsLoading.value=false
                        newsError.value=true
                        e.printStackTrace()
                    }


                })
        )
    }
}