package LabThree;

import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);


        System.out.println("PLease enter the angles of each side of the triangle");

        int side1 = Integer.parseInt(scn.nextLine());
        int side2 = Integer.parseInt(scn.nextLine());
        int side3 = Integer.parseInt(scn.nextLine());

        if (side1 != side2 && side2 != side3 && side1 != side3)
        {
            System.out.println("The triangle is scalene.");
        } else if (side1 == side2 || side2 == side3 || side1 == side3)
        {
            System.out.println("The triangle is isosceles.");
        } else
        {
            System.out.println("The triangle is equilateral.");
        }
    }
}
