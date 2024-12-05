package weekTen.labTen;

public class CharacterTest {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Athena", 100, 35);
        Mage mage = new Mage("Merlin", 80, 60);
        Archer archer = new Archer("Robin", 90, 50);

        System.out.println("Testing Encapsulation and Health:");
        warrior.setHealth(90);
        System.out.println("Warrior: " + warrior.getName() + " Health: " + warrior.getHealth()); // Expected: 90
        mage.setHealth(85);
        System.out.println("Mage: " + mage.getName() + " Health: " + mage.getHealth()); // Expected: 85
        archer.setHealth(-10); // Invalid health value
        System.out.println("Archer: " + archer.getName() + " Health: " + archer.getHealth()); // Expected: 0
    }
}
