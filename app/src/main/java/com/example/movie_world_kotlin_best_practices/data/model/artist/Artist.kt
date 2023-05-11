package com.example.movie_world_kotlin_best_practices.data.model.artist


import com.google.gson.annotations.SerializedName

data class Artist(
    @SerializedName("cast")
    val cast: List<Cast>,
    @SerializedName("crew")
    val crew: List<Crew>,
    @SerializedName("id")
    val id: Int
)