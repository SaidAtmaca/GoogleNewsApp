package com.example.googlenewsapp.service

import com.example.googlenewsapp.model.GeneralModel
import io.reactivex.Single
import retrofit2.http.GET

interface NewsApi {
    // base url https://newsapi.org/
    //v2/top-headlines?country=tr&apiKey=7b4e571a34c64c8e823ffb7bb6f9a5db
    ////7b4e571a34c64c8e823ffb7bb6f9a5db

    @GET("v2/top-headlines?country=tr&apiKey=7b4e571a34c64c8e823ffb7bb6f9a5db")
    fun getNews(): Single<GeneralModel>
}