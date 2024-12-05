package weekThree;

import java.util.Scanner;

public class Hogwarts {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter a Hogwarts house");
        String house = scn.nextLine();

        switch (house){
            case "ravenclaw":
                System.out.println("you picked ravenclaw: House animal is a raven. colors are royal purple and black");
                break;
            case"gryffindor":
                System.out.println("You picked gryffindor: House animanl is a gryffin. colors are red and yellow");
                break;
            case "hufflepuff":
                System.out.println("You picked hufflepuff: house animal is a badger. the house colors are balck and yellow");
                break;
            case "slytherin":
                System.out.println("you picked slytherin: house animal is a bassilisk. house colors are green and grey ");
                break;

        }
    }
}
