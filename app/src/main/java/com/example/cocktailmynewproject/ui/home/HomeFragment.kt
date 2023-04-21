package com.example.cocktailmynewproject.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cocktailmynewproject.R
import com.example.cocktailmynewproject.data.model.CoktailModel
import com.example.cocktailmynewproject.data.model.DrinkModel
import com.example.cocktailmynewproject.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val viewModel by viewModels<HomeViewModel> ()
    private var cocktailAdapter: CocktailAdapter? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        viewModel.cocktail.observe(viewLifecycleOwner){
            it?.let {

            setupUI(it)
            }


        }
        viewModel.getDrinkModel()
        return binding.root
    }

    private fun setupUI(cocktail: CoktailModel) {
       cocktailAdapter= CocktailAdapter(cocktail.drinks as List<DrinkModel>)

        binding.fragmentcocktail.apply {


            layoutManager = LinearLayoutManager(context)

            adapter=cocktailAdapter


        }


        cocktailAdapter!!.onItemClick = {
            val bundle = Bundle().apply {
                putSerializable("drinks",it)

            }


          findNavController().navigate(R.id.action_navigation_home_to_cocktailDetail,bundle)

        }

    }


    }






