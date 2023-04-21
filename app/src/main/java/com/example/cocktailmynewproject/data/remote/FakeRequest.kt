package com.example.cocktailmynewproject.data.remote

import com.example.cocktailmynewproject.data.model.CoktailModel
import com.example.cocktailmynewproject.data.model.DrinkModel
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class FakeRequest {
    private lateinit var apiRequest: ApiRequest


//
//    @Before
//    fun setup() {
//        val retrofit = Retrofit.Builder()
//            .baseUrl("https://example.com/")
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//
//        apiRequest = retrofit.create(ApiRequest::class.java)
//
//    }
//
//    @Test
//    fun `test getBase_Url returns CoktailModel`() = runBlocking {
//        // Given
//        val expectedCoktailModel = CoktailModel(listOf(DrinkModel("Margarita")))
//
//        // When
//        val actualCoktailModel = apiRequest.getBase_Url()
//
//        // Then
//        assertEquals(expectedCoktailModel, actualCoktailModel)
//    }
//
    //}

}