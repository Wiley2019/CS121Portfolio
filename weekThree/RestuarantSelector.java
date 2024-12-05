package weekThree;

import java.util.Scanner;

import static java.lang.String.*;

public class RestuarantSelector {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Is anyone Vegetarian? :");
        String Vegetarian = scn.nextLine();

        System.out.println("Is anyone Vegan? :");
        String vegan = scn.nextLine();

        System.out.println("Is anyone Gluten Free? :");
        String gluten = scn.nextLine();

        if (Vegetarian == "yes" || Vegetarian == "yes" && gluten == "yes" && gluten == "yes") {
            System.out.println("Mama's Fine Italian");
            System.out.println("The Chef's Kitchen");
        }

        else if (gluten == "yes") {
            System.out.println("Main Street Pizza Company");
            System.out.println("Corner Café");
            System.out.println("The Chef's Kitchen");
        }

        else if (vegan == "yes" && Vegetarian == "yes") {
            System.out.println("Main Street Pizza Company");
            System.out.println("Corner Café");
            System.out.println("The Chef's Kitchen");
        }
        }


    }



