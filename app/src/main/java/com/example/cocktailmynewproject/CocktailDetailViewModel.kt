package com.example.cocktailmynewproject

import androidx.lifecycle.ViewModel
import com.example.cocktailmynewproject.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CocktailDetailViewModel @Inject constructor(
    val repository: Repository
) : ViewModel() {

}