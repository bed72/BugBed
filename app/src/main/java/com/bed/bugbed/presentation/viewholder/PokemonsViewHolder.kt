package com.bed.bugbed.presentation.viewholder

import android.view.ViewGroup
import android.view.LayoutInflater

import androidx.recyclerview.widget.RecyclerView

import coil.load
import coil.transform.CircleCropTransformation

import com.bed.bugbed.GetAllPokemonsQuery

import com.bed.bugbed.databinding.ItemPokemonBinding

class PokemonsViewHolder(
    itemPokemonBinding: ItemPokemonBinding
) : RecyclerView.ViewHolder(itemPokemonBinding.root) {

    private val imagePokemon = itemPokemonBinding.imagePokemon
    private val textNameCharacter = itemPokemonBinding.textNamePokemon

    fun bind(pokemon: GetAllPokemonsQuery.Result) {
        textNameCharacter.text = pokemon.name
        imagePokemon.load(pokemon.image) {
            crossfade(true)
            transformations(CircleCropTransformation())
        }
    }

    companion object {
        fun create(parent: ViewGroup): PokemonsViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val itemBinding = ItemPokemonBinding.inflate(inflater, parent, false)

            return PokemonsViewHolder(itemBinding)
        }
    }
}