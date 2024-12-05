package labTen;

import java.util.ArrayList;

public class Pokedex {
    private ArrayList<Pokemon> pokemonArrayList;

    public Pokedex() {
        pokemonArrayList = new ArrayList<>();
    }

    // Add Pokemon to Pokedex
    public void addPokemon(Pokemon pokemon) {
        pokemonArrayList.add(pokemon);
    }

    // Remove Pokemon from Pokedex
    public boolean removePokemon(String name) {
        for (Pokemon pokemon : pokemonArrayList) {
            if (pokemon.getName().equalsIgnoreCase(name)) {
                pokemonArrayList.remove(pokemon);
                return true;
            }
        }
        return false;
    }

    // Get a Pokemon by name
    public Pokemon getPokemon(String name) {
        for (Pokemon pokemon : pokemonArrayList) {
            if (pokemon.getName().equalsIgnoreCase(name)) {
                return pokemon;
            }
        }
        return null;
    }

    // Get the entire list of Pokémon
    public ArrayList<Pokemon> getAllPokemon() {
        return pokemonArrayList;
    }
}
