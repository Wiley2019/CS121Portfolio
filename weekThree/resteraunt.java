package weekThree;
import java.util.Scanner;

public class resteraunt {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Input collection
        System.out.println("Is anyone Vegetarian? (yes/no):");
        String vegetarian = scn.nextLine().trim().toLowerCase();

        System.out.println("Is anyone Vegan? (yes/no):");
        String vegan = scn.nextLine().trim().toLowerCase();

        System.out.println("Is anyone Gluten Free? (yes/no):");
        String gluten = scn.nextLine().trim().toLowerCase();

        // Restaurant recommendations based on conditions
        if (vegetarian.equals("yes") && gluten.equals("yes")) {
            System.out.println("Mama's Fine Italian");
            System.out.println("The Chef's Kitchen");
        }

            else if (gluten.equals("yes")) {
                System.out.println("Main Street Pizza Company");
                System.out.println("Corner Café");
                System.out.println("The Chef's Kitchen");
        }

            else if (vegan.equals("yes")) {
                System.out.println("Main Street Pizza Company");
                System.out.println("Corner Café");
                System.out.println("The Chef's Kitchen");
        }
        else;
        {
            System.out.println("Joe’s Gourmet Burgers");
        }


        // Close the scanner
        scn.close();
    }
}