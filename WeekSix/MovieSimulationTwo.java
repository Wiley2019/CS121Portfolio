import java.util.Random;

public class MovieSimulationTwo {
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

        // Initialize the seat availability array
        int[][] movieAvailability = new int[ROWS][COLUMNS];

        // Set initial seat availability
        setSeatAvailability(movieAvailability);

        // Display initial seat availability
        System.out.println("Initial Seat Availability:");
        displaySeatAvailability(movieAvailability);

        // Randomize seat availability
        randomizeAvailability(movieAvailability);

        // Display updated seat availability
        System.out.println("Randomized Seat Availability:");
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

    // Method to display seat availability
    public static void displaySeatAvailability(int[][] seats) {
        System.out.println("Seat Availability (0 = Empty, 1 = Occupied):");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
}
