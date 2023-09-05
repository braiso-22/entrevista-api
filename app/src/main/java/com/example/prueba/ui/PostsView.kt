package com.example.prueba.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.prueba.model.Post
import com.example.prueba.viewmodels.PostsViewModel

@Composable
fun PostsView(postList: ArrayList<Post>, postViewModel: PostsViewModel) {
    Box(
        Modifier.fillMaxSize()
    ){
        postViewModel.getPosts()
        LazyColumn {
            items(postList) { post ->
                PostComposable(post)
            }
        }
    }
}