package com.example.cocktailmynewproject.data.repository

import com.example.cocktailmynewproject.data.model.DrinkModel
import com.example.cocktailmynewproject.data.remote.ApiRequest
import javax.inject.Inject

class RepoImplementaion @Inject constructor(
    val apiRequest: ApiRequest
): Repository {
    override suspend fun getBase_Url() = apiRequest.getBase_Url()

    }



