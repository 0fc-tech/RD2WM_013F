package com.example.mod9room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Oiseau(
    @PrimaryKey(autoGenerate = true)
    val id : Long =0L,
    val espece : String,
    val peutVoler : Boolean,
    val couleur : String,
    val vMax : Int
)
