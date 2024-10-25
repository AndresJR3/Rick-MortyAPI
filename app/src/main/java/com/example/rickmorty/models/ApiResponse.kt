package com.example.rickmorty.models

data class ApiResponse(
    val info: Info,
    val results: List<Character>
)