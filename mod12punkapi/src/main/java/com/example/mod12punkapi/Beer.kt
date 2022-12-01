package com.example.mod12punkapi

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Beer(
    val name : String,
    val tagline : String,
    val description: String,
    @Json(name = "image_url")
    val imageUrl:String,
    val abv:Double,
)
