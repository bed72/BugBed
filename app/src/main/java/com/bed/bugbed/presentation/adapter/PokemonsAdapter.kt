package com.bed.bugbed.presentation.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.bed.bugbed.GetAllPokemonsQuery
import com.bed.bugbed.presentation.viewholder.PokemonsViewHolder

class PokemonsAdapter : ListAdapter<GetAllPokemonsQuery.Result, PokemonsViewHolder>(diffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        PokemonsViewHolder.create(parent)

    override fun onBindViewHolder(holder: PokemonsViewHolder, position: Int) {
        getItem(position)?.let {
            holder.bind(it)
        }
    }

    companion object {
        private val diffCallback = object : DiffUtil.ItemCallback<GetAllPokemonsQuery.Result>() {
            override fun areItemsTheSame(oldItem: GetAllPokemonsQuery.Result, newItem: GetAllPokemonsQuery.Result) =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: GetAllPokemonsQuery.Result, newItem: GetAllPokemonsQuery.Result) =
                oldItem == newItem
        }
    }
}