package WeekSeven;

import java.util.Random;
import java.util.Scanner;

public class MovieSimulationThree {
    // Constants for the theater dimensions
    private static final int ROWS = 5;
    private static final int COLUMNS = 10;

    public static void main(String[] args) {
        // Predefined movie details
        String[] movieNames = {"The Matrix", "Inception", "Interstellar", "The Godfather"};
        String[] movieTypes = {"Sci-Fi", "Sci-Fi", "Sci-Fi", "Crime"};
        double[] moviePrices = {10.99, 12.99, 14.99, 9.99};

        // Display the movie details
        displayMovieDetails(movieNames, movieTypes, moviePrices);

        // Select a movie
        int index = selectMovie(movieNames);

        // Display the selected movie
        displaySelectedMovie(movieNames[index], movieTypes[index], moviePrices[index]);

        // Initialize the seat availability array
        int[][] movieAvailability = new int[ROWS][COLUMNS];
        setSeatAvailability(movieAvailability);

        // Randomize seat availability and display it
        randomizeAvailability(movieAvailability);
        displaySeatAvailability(movieAvailability);
    }

    // Method to set all seats as available (0)
    public static void setSeatAvailability(int[][] seats) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                seats[i][j] = 0; // 0 = empty
            }
        }
    }

    // Method to randomize seat availability
    public static void randomizeAvailability(int[][] seats) {
        Random random = new Random();
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                // Randomly assign 0 or 1 to each seat
                if (seats[i][j] == 0) {
                    seats[i][j] = random.nextInt(2); // 0 = empty, 1 = occupied
                }
            }
        }
    }

    // Method to display movie details
    public static void displayMovieDetails(String[] names, String[] types, double[] prices) {
        System.out.printf("%-20s %-15s %-10s%n", "Movie Name", "Movie Type", "Price");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-20s %-15s $%-9.2f%n", names[i], types[i], prices[i]);
        }
    }

    // Method to select a movie
    public static int selectMovie(String[] movieNames) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the name of the movie you would like to select: ");
            String selectedMovie = scanner.nextLine();

            for (int i = 0; i < movieNames.length; i++) {
                if (movieNames[i].equalsIgnoreCase(selectedMovie)) {
                    return i; // Return the index of the selected movie
                }
            }
            System.out.println("Movie not found. Try again.");
        }
    }

    // Method to display the selected movie
    public static void displaySelectedMovie(String name, String type, double price) {
        System.out.printf("You have selected: %-20s %-15s $%-9.2f%n", name, type, price);
    }

    // Method to display seat availability
    public static void displaySeatAvailability(int[][] seats) {
        System.out.println("--------------------Seat Availability-------------------- ");
        System.out.println("(0 = Empty, 1 = Occupied)");
        System.out.print("   "); // Space for row labels
        for (int j = 1; j <= COLUMNS; j++) {
            System.out.printf("%-3d", j); // Column numbers
        }
        System.out.println();
        System.out.println("________________________________");


        char rowLabel = 'A'; // Start from row A
        for (int i = 0; i < ROWS; i++) {
            System.out.print(rowLabel + "|" + " "); // Print row label
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(seats[i][j] + "  "); // Seat availability
            }
            System.out.println();
            rowLabel++; // Move to next row label
        }
    }
}
