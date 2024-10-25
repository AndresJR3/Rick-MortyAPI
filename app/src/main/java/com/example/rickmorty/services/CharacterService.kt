package com.example.rickmorty.services

import com.example.rickmorty.models.Character
import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterService {

    @GET("Character")
    suspend fun getCharacters() : List<Character>

    @GET("products/{id}")
    suspend fun getCharactersById(@Path("id") id: Int) : Character




}