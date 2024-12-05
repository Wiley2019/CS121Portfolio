package weekThree;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.printf("Please enter number u want to check:");

        int number = Integer.parseInt(scn.nextLine());
        int b = 0;

        int remainder = (number % 2);

        if (remainder == 0) {
            System.out.println("The number " + number + " is even");
        } else {
            System.out.println("The number " + number + " is odd");
        }

    }
}