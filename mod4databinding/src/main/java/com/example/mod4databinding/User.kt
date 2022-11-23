package com.example.mod4databinding

data class User(
    var prenom:String,
    var nom: String,
    var email:String = "",
    var darkModeSelected: Boolean
)