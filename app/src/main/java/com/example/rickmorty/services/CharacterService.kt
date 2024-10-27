package com.example.rickmorty.services

import com.example.rickmorty.models.ApiResponse
import com.example.rickmorty.models.Character
import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterService {

    @GET("character")
    suspend fun getCharacters(): ApiResponse

    @GET("character/{id}")
    suspend fun getCharactersById(@Path("id") id: Int):Character

}