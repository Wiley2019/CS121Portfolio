package weekTen.labTen;

public class Archer extends Character implements Fighter {
    public Archer(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void attack(Character opponent) {
        System.out.println(getName() + " shoots an arrow at " + opponent.getName() + " for " + getAttackPower() + " damage.");
        opponent.setHealth(opponent.getHealth() - getAttackPower());
    }

    @Override
    public void defend(int damage) {
        setHealth(getHealth() - damage);
    }
}
