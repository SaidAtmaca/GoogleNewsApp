package com.example.googlenewsapp.model

import com.google.gson.annotations.SerializedName

data class GeneralModel(
    @SerializedName("status")
    val status: String?,
    @SerializedName("totalResults")
    val totalResults: String?,
    @SerializedName("articles")
    val articles: List<NewsModel>
)
