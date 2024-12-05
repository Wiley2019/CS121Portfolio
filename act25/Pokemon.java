import java.util.ArrayList;

public class Pokemon {
    private String name;
    private int hp;
    private ArrayList<Move> moves;

    public Pokemon(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.moves = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void addMove(Move move) {
        moves.add(move);
    }

    public ArrayList<Move> getMoveArrayList() {
        return moves;
    }
}
