import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create an instance of GymSet
        GymSet gymSet = new GymSet();
        Scanner scanner = new Scanner(System.in);

        // Display the header for the menu
        System.out.println("Gym Scheduled Classes System");

        // Menu loop
        while (true) {
            // Display the menu options
            System.out.println("\nMenu:");
            System.out.println("1. Add a gym class");
            System.out.println("2. View scheduled classes");
            System.out.println("3. Exit the system");
            System.out.print("Choose an option: ");

            // Read the user's choice
            int choice = Integer.parseInt(scanner.nextLine());

            // Handle the user's choice using a switch statement
            switch (choice) {
                case 1:
                    gymSet.addTables(); // Call addTables to add gym tables
                    break;
                case 2:
                    gymSet.displayTables(); // Call displayTables to show all gym tables
                    break;
                case 3:
                    System.out.println("Exiting the system. Goodbye!");
                    return; // Exit the program
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
