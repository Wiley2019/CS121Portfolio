package labTen;

import java.util.ArrayList;

public class Pokemon {
    private String name;
    private int hp;
    private ArrayList<Move> moveArrayList;

    public Pokemon(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.moveArrayList = new ArrayList<>();
    }

    // Add move to the Pokemon
    public void addMove(Move move) {
        moveArrayList.add(move);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public ArrayList<Move> getMoveArrayList() {
        return moveArrayList;
    }

    public String displayInfo() {
        StringBuilder info = new StringBuilder("Pokemon: " + name + ", HP: " + hp + "\nMoves: \n");
        for (Move move : moveArrayList) {
            info.append(move.toString()).append("\n");
        }
        return info.toString();
    }
}
