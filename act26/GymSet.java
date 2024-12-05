import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;

public class GymSet {

    // Field: Set to store unique table names or numbers
    private Set<String> tables;

    // Constructor to initialize the Set
    public GymSet() {
        tables = new HashSet<>();
    }

    // Method 1: Add gym tables to the set
    public void addTables() {
        Scanner scanner = new Scanner(System.in);
        String table;

        // Continuously ask the user for table names or numbers to add
        System.out.println("Enter table names or numbers to add (enter '0' to quit):");
        while (true) {
            System.out.print("Table: ");
            table = scanner.nextLine();

            if (table.equals("0")) {
                return; // Exit the method if the user enters '0'
            }

            // Add the table to the set (duplicates are automatically handled by Set)
            if (tables.add(table)) {
                System.out.println("Table " + table + " added.");
            } else {
                System.out.println("Table " + table + " already exists.");
            }
        }
    }

    // Method 2: Display all gym tables
    public void displayTables() {
        // Create an iterator to iterate over the tables set
        Iterator<String> iterator = tables.iterator();

        // Display header for the gym tables
        System.out.println("Gym Tables:");

        // Iterate over the set using the iterator
        if (iterator.hasNext()) {
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } else {
            System.out.println("No tables scheduled.");
        }
    }
}
