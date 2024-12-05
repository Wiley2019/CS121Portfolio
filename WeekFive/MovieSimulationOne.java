package WeekFive;

import java.util.Scanner;

public class MovieSimulationOne {
    // Constant variable for maximum number of movies
    private static final int MAX_MOVIES = 10;

    // Arrays to hold movie details
    private String[] movieNames;
    private String[] movieTypes;
    private boolean[] movieAvailability;
    private double[] moviePrices;

    public MovieSimulationOne(int numberOfMovies) {
        movieNames = new String[numberOfMovies];
        movieTypes = new String[numberOfMovies];
        movieAvailability = new boolean[numberOfMovies];
        moviePrices = new double[numberOfMovies];
    }

    public void inputMovieDetails() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < movieNames.length; i++) {
            System.out.print("Enter the name of movie " + (i + 1) + ": ");
            movieNames[i] = scanner.nextLine();

            System.out.print("Enter the type of movie " + (i + 1) + ": ");
            movieTypes[i] = scanner.nextLine();

            System.out.print("Is the movie available? (true/false): ");
            movieAvailability[i] = scanner.nextBoolean();

            System.out.print("Enter the price of movie " + (i + 1) + ": ");
            moviePrices[i] = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline
        }

        scanner.close();
    }

    public void displayMovieDetails() {
        System.out.printf("%-20s %-15s %-15s %-10s%n", "Movie Name", "Movie Type", "Availability", "Price");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < movieNames.length; i++) {
            System.out.printf("%-20s %-15s %-15s $%-9.2f%n",
                    movieNames[i],
                    movieTypes[i],
                    movieAvailability[i] ? "Available" : "Not Available",
                    moviePrices[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many movie details would you like to enter (up to " + MAX_MOVIES + "): ");
        int numberOfMovies = Math.min(scanner.nextInt(), MAX_MOVIES);
        scanner.nextLine(); // Consume the newline

        MovieSimulationOne movieSimulation = new MovieSimulationOne(numberOfMovies);

        movieSimulation.inputMovieDetails();
        movieSimulation.displayMovieDetails();

        scanner.close();
    }
}
