import java.util.ArrayList;

public class Pokedex {
    private ArrayList<Pokemon> pokemonList;

    public Pokedex() {
        pokemonList = new ArrayList<>();
    }

    public void addPokemon(Pokemon pokemon) {
        pokemonList.add(pokemon);
    }

    public ArrayList<Pokemon> getAllPokemon() {
        return pokemonList;
    }
}
