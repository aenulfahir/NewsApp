package com.example.newsapp.networks

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {
    companion object{

        val API_KEY = "02ccefe5946347c58659b0cf1d26d182"
        fun getClient() : Retrofit {
            val BASE_URL = "https://newsapi.org/v2/"
            val retrofit : Retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit
        }
    }
}