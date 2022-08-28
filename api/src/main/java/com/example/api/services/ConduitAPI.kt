package com.example.api.services

import com.example.api.models.ArticlesResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface ConduitAPI {

    @GET("articles")
    suspend fun getArticles() : Response<ArticlesResponse>
}