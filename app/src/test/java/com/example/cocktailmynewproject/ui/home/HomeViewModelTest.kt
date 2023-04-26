package com.example.cocktailmynewproject.ui.home

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.cocktailmynewproject.data.model.CoktailModel
import com.example.cocktailmynewproject.data.model.DrinkModel
import com.example.cocktailmynewproject.data.repository.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule

import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import java.util.Collections.addAll

class HomeViewModelTest {

    private val testDispatcher = StandardTestDispatcher()


    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    lateinit var repository: Repository

    @Before
    fun setUP() {
        MockitoAnnotations.openMocks(this)
        Dispatchers.setMain(testDispatcher)
    }

    @Test
    fun getDrinkModel() = runTest {
        val drink = listOf(
            DrinkModel(
                idDrink = "15266",
                strCategory = "Ordinary Drink",
                strDrink = "Avalon"
            ),
//        DrinkModel(
//            idDrink = "2",
//            strCategory = "Ordinary Drink",
//            strDrink = "Abilene"
//        )
        )
        val drink_sample = CoktailModel(drink)


        Mockito.`when`(repository.getBase_Url()).thenReturn(drink_sample)

        val viewModel = HomeViewModel(repository)
        viewModel.getDrinkModel()
        // Call the function that uses the repository to get the cocktails

        testDispatcher.scheduler.advanceUntilIdle()


        // Check that the products LiveData contains the expected result
        viewModel.cocktail.value?.let { value ->
            assertEquals(1, value.drinks.size ?: 0)


        }
    }
}