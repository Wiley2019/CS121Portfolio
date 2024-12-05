package weekTwo;

import java.util.Scanner;

public class scannerArea {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.printf("Please enter the length: ");
        double length = Double.parseDouble(scn.nextLine());
        System.out.printf("Please enter the width: ");
        double width= Double.parseDouble(scn.nextLine());

        double TotalArea = length * width;

        System.out.printf("The total area is: %.2f",TotalArea);





    }

}
