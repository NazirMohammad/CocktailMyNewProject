package com.example.cocktailmynewproject.data.model


import com.google.gson.annotations.SerializedName

data class CoktailModel(
    @SerializedName("drinks")
    val drinks: List<DrinkModel?>
): java.io.Serializable