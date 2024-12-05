package Project2;
import java.util.Random;
import java.util.Scanner;

public class TestScores {
    // Constant for the number of test scores
    private static final int SIZE = getRandomSize();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create arrays for test scores and letter grades
        int[] testScores = new int[SIZE];
        char[] letterGrades = new char[SIZE];

        // Print number of test scores
        System.out.println("You will enter " + SIZE + " test scores.");

        // Populate test scores array
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Enter score for test " + (i + 1) + ": ");
            testScores[i] = scanner.nextInt();
        }

        // Populate letter grades array
        for (int i = 0; i < SIZE; i++) {
            letterGrades[i] = getLetterGrade(testScores[i]);
        }

        // Print grades
        printGrades(testScores, letterGrades);
        printHighestScore(testScores);
        printLowestScore(testScores);
        printAverageScore(testScores);

        // Close the scanner
        scanner.close();
    }

    // Method to get a random number between 3 and 10
    private static int getRandomSize() {
        Random random = new Random();
        return random.nextInt(8) + 3; // Random number between 3 and 10
    }

    // Method to determine letter grade
    public static char getLetterGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Method to print test scores and letter grades
    public static void printGrades(int[] scores, char[] grades) {
        System.out.println("Score\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i] + "\t" + grades[i]);
        }
    }

    // Method to print the highest score
    public static void printHighestScore(int[] scores) {
        int highest = scores[0];
        for (int score : scores) {
            if (score > highest) {
                highest = score;
            }
        }
        System.out.println("Highest score: " + highest);
    }

    // Method to print the lowest score
    public static void printLowestScore(int[] scores) {
        int lowest = scores[0];
        for (int score : scores) {
            if (score < lowest) {
                lowest = score;
            }
        }
        System.out.println("Lowest score: " + lowest);
    }

    // Method to print the average score
    public static void printAverageScore(int[] scores) {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        double average = (double) total / scores.length;
        System.out.printf("Average score: %.2f%n", average);
    }
}