package com.example.prueba.api

import com.example.prueba.model.Post
import retrofit2.Response
import retrofit2.http.GET

interface PostApi {
    @GET("/posts")
    suspend fun getPosts(): Response<ArrayList<Post>>
}