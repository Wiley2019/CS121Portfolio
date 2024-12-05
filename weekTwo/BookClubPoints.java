package weekTwo;

import java.util.Scanner;

public class BookClubPoints {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the nuber of books purchased");

        int points;

        int booksPurchased;

        booksPurchased = Integer.parseInt(scn.nextLine());
        ;

        if (booksPurchased == 0 ){
            points = 0;
        } else if (booksPurchased == 1) {
            points = 5;
        } else if (booksPurchased == 2) {
            points = 15;

        } else if (booksPurchased == 3) {
            points = 30;

        }
        else if (booksPurchased == 4){
            points = 60;
        }
        else{
            points = -1;
            System.out.println("invalid input");
        }
        System.out.printf("The amount you are awarded is: %d", points);
        scn.close();
    }
}
