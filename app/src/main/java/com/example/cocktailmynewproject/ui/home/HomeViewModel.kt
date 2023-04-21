package com.example.cocktailmynewproject.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cocktailmynewproject.data.model.CoktailModel
import com.example.cocktailmynewproject.data.model.DrinkModel
import com.example.cocktailmynewproject.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    val repository: Repository
) : ViewModel() {

    var cocktail = MutableLiveData<CoktailModel>()

    fun getDrinkModel() {
        viewModelScope.launch {
            cocktail.postValue(repository.getBase_Url())


//
//        }
//            fun getDrinkModel(){
//                viewModelScope.launch {
//                    val result = repository.getBase_Url()
//                    cocktail.postValue(result)
        }
    }
}