package com.example.cocktailmynewproject.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.cocktailmynewproject.R
import com.example.cocktailmynewproject.data.model.DrinkModel
import com.example.cocktailmynewproject.databinding.ItemCocktailBinding

class CocktailAdapter(val cocktail: List<DrinkModel?>):
RecyclerView.Adapter<CocktailAdapter.ViewHolder>(){

    var onItemClick: ((DrinkModel) -> Unit)? = null

    class ViewHolder(val view:View):  RecyclerView.ViewHolder(view) {

        val binding = ItemCocktailBinding.bind(view)
        fun handleData(item: DrinkModel?) {
            item?.let {
                with(it) {

                    binding.drink3.text= item.idDrink
                    binding.drink1.text = item.strDrink

                    binding.drink2.text=item.strCategory

                    Glide.with(view).load(item.strDrinkThumb)
                        .into(binding.imageView)


                }
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=
            LayoutInflater.from(parent.context).inflate(R.layout.item_cocktail, parent,false)
        return ViewHolder(view)

    }

    override fun getItemCount(): Int = cocktail?.size ?: 0


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.handleData(cocktail?.get(position))
        holder.itemView.setOnClickListener {


            cocktail?.get(position)?.let {
                onItemClick?.invoke(it)
            }
        }

    }
    }


