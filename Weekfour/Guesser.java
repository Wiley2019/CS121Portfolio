package Weekfour;

import java.util.Scanner;

public class Guesser {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);



        String guess;
        int randNum = (int) Math.random();
        int count = 0;
        int time = 1;

        while (time == 1){
            System.out.println("Please enter a number between 1 and 100 or q if you give up");
            guess = scn.nextLine();
            if (guess == "q"){
                System.out.println("Quitter you suck");
                time = 0;
                break;
            }
            int integer = Integer.parseInt(guess);
            if ( integer > randNum) {
                System.out.println("Guess is too high");
                count+=1;
                System.out.printf("Number of guesses: %d",count);

            }
            else if(integer < randNum) {
                System.out.println("Guess is too low");
                count+=1;
                System.out.printf("Number of guesses: %d",count);
            }

            else if (integer == randNum){
                System.out.println("You guessed correctly congrats");
                System.out.printf("It too you %d number of guesses",count);
                time = 0;

            }
        }

    }
}
