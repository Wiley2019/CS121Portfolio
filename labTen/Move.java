package labTen;

public class Move {
    private String name;
    private int power;
    private int speed;

    public Move(String name, int power, int speed) {
        this.name = name;
        this.power = power;
        this.speed = speed;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Move{name='" + name + "', power=" + power + ", speed=" + speed + "}";
    }
}