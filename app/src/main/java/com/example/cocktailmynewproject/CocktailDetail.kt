package com.example.cocktailmynewproject

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.cocktailmynewproject.data.model.DrinkModel
import com.example.cocktailmynewproject.databinding.FragmentCocktailDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CocktailDetail : Fragment() {


    private var _binding: FragmentCocktailDetailBinding? = null

    private val binding get()= _binding!!
    private lateinit var viewModel: CocktailDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {


        viewModel = ViewModelProvider(this)[CocktailDetailViewModel::class.java]
        _binding = FragmentCocktailDetailBinding.inflate(inflater, container, false)

        val drinks = arguments?.getSerializable("drinks") as DrinkModel?

        binding.people1.text = drinks?.strInstructions
        binding.people2.text = drinks?.strInstructionsZHHANS
        view?.let {
            Glide.with(it).load(drinks?.strDrinkThumb)
                .into(binding.imageView)


        }


        return binding.root
    }

}