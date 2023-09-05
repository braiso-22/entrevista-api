package com.example.prueba.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.prueba.model.Post

@Composable
fun PostComposable(post: Post) {
    Card(
        Modifier.padding(16.dp)
    ) {
        Column {
            Text(post.body)
            Text(post.title)
            Text(post.id.toString())
            Text(post.userId.toString())
        }
    }
}