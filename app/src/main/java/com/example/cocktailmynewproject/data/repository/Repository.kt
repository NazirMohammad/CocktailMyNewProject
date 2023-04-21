package com.example.cocktailmynewproject.data.repository

import com.example.cocktailmynewproject.data.model.CoktailModel
import com.example.cocktailmynewproject.data.model.DrinkModel

interface Repository {

    suspend fun getBase_Url(): CoktailModel
}