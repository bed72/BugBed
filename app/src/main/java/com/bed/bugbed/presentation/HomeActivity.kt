package com.bed.bugbed.presentation

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity

import org.koin.androidx.viewmodel.ext.android.viewModel

import com.bed.bugbed.databinding.ActivityHomeBinding

import com.bed.bugbed.presentation.adapter.PokemonsAdapter

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    private lateinit var pokemonsAdapter: PokemonsAdapter
    private val viewModel: PokemonViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupBinding()
        observeEvents()
        initAdapter()
    }

    private fun initAdapter() {
        pokemonsAdapter = PokemonsAdapter()

        with(binding.recyclerPokemons) {
            adapter = pokemonsAdapter
        }
    }

    private fun setupBinding() {
        binding =  ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun observeEvents() {
        viewModel.pokemonsLiveData.observe(this) { pokemons ->
            pokemonsAdapter.submitList(pokemons)
        }
    }
}