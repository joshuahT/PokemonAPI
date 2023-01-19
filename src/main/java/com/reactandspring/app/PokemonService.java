package com.reactandspring.app;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PokemonService {
    public List<Pokemon> getPokemon(){
        return PokemonData.getPokemonList();
    }
    public Pokemon getPokemonById(int id){
        for (Pokemon pokemon : PokemonData.getPokemonList()){
            if (pokemon.getId() == id){
                return pokemon;
            }
        }
        return null;
    }
}
