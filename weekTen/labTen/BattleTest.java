package weekTen.labTen;

public class BattleTest {
    public static void main(String[] args) {
        Fighter warrior = new Warrior("Thor", 100, 30);
        Fighter mage = new Mage("Gandalf", 80, 50);
        System.out.println("Battle Start!");

        while (((Character) warrior).isAlive() && ((Character) mage).isAlive()) {
            warrior.attack((Character) mage);
            if (!((Character) mage).isAlive()) {
                System.out.println("\nMage: " + ((Character) mage).getName() + " has been defeated!");
                break;
            }

            mage.attack((Character) warrior);
            if (!((Character) warrior).isAlive()) {
                System.out.println("\nWarrior: " + ((Character) warrior).getName() + " has been defeated!");
                break;
            }
        }

        if (((Character) warrior).isAlive()) {
            System.out.println("\nWarrior: " + ((Character) warrior).getName() + " wins the battle!");
        } else {
            System.out.println("\nMage: " + ((Character) mage).getName() + " wins the battle!");
        }
    }
}
