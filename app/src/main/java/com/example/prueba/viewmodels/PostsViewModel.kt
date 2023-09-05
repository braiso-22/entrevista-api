package com.example.prueba.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.prueba.api.RetrofitInstance
import com.example.prueba.model.Post
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class PostsViewModel : ViewModel() {

    var posts: ArrayList<Post> by mutableStateOf(arrayListOf())

    fun getPosts() {
        viewModelScope.launch(Dispatchers.IO) {
            val result = RetrofitInstance.api.getPosts()
            if (result.isSuccessful) {
                posts = result.body()!!
            }
        }
    }
}