package com.example.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Image(
    val name: String,
    val description: String,
    val imageUrl: String
)