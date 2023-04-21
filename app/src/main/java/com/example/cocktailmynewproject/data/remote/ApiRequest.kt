package com.example.cocktailmynewproject.data.remote

import com.example.cocktailmynewproject.data.model.CoktailModel
import com.example.cocktailmynewproject.data.model.DrinkModel
import retrofit2.http.GET

interface ApiRequest {
    @GET(ApiDetail.coktail)
    suspend fun getBase_Url(): CoktailModel

}