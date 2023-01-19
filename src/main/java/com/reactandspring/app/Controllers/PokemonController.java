package com.reactandspring.app.Controllers;

import com.reactandspring.app.Pokemon;
import com.reactandspring.app.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController

public class PokemonController {

    private final PokemonService pokemonService;

    @Autowired
    public PokemonController (PokemonService pokemonService){
        this.pokemonService = pokemonService;
    }

    @GetMapping("/pokemon")
    public ResponseEntity<List<Pokemon>> getPokemon(){
        List<Pokemon> pokemonList = pokemonService.getPokemon();
        return new ResponseEntity<>(pokemonList,HttpStatus.ACCEPTED);
    }

    @GetMapping("/pokemon/{id}")
    public ResponseEntity<Pokemon> getPokemonById(@PathVariable int id){
        Pokemon pokemon = pokemonService.getPokemonById(id);
        if (pokemon == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(pokemon,HttpStatus.ACCEPTED);
    }
        @RequestMapping(value = "/hello", method=RequestMethod.GET)
        public ResponseEntity<Object> hello(){
            Map<String, String> str = new HashMap<>();
            str.put("Message","Pokemon");
            return new ResponseEntity<>(str, HttpStatus.OK);
        }

}
