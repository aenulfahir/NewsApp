package com.example.newsapp.networks

import com.example.newsapp.models.headline.HeadlineModel
import com.example.newsapp.models.news.NewsModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiInterface {

    @GET("top-headlines")
    fun getHeadlines(
        @Query("country") country: String?,
        @Query("apikey") apikey: String?
    ): Call<HeadlineModel>

    @GET("everything")
    fun getArticle(
        @Query("q") q: String?,
        @Query("apikey") apikey: String?
    ): Call<NewsModel>
}