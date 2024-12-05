package weekTen.labTen;

public class Mage extends Character implements Fighter {
    public Mage(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void attack(Character opponent) {
        System.out.println(getName() + " casts a spell on " + opponent.getName() + " for " + getAttackPower() + " damage.");
        opponent.setHealth(opponent.getHealth() - getAttackPower());
    }

    @Override
    public void defend(int damage) {
        setHealth(getHealth() - damage);
    }
}
