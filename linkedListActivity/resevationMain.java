package linkedListActivity;

import java.util.Scanner;

public class resevationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create two instances of Reservation
        Reservation reservation1 = new Reservation("Alice Johnson", "FL123", 299.99);
        Reservation reservation2 = new Reservation("Bob Smith", "FL456", 399.99);

        // Adding reservations for reservation 1
        System.out.println("Adding reservations for Reservation 1:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter reservation entry (e.g., Seat number): ");
            String entry = scanner.nextLine();
            reservation1.addEntry(entry);
        }

        // Adding reservations for reservation 2
        System.out.println("\nAdding reservations for Reservation 2:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter reservation entry (e.g., Seat number): ");
            String entry = scanner.nextLine();
            reservation2.addEntry(entry);
        }

        // Print reservation information
        System.out.println("\nReservation Information:");
        System.out.println(reservation1.getInfo());
        System.out.println(reservation2.getInfo());

        // Remove one reservation from each booking
        reservation1.removeEntry();
        reservation2.removeEntry();

        // Display the updated list of reservations for each booking
        System.out.println("\nUpdated List of Reservations:");
        reservation1.displayEntries();
        reservation2.displayEntries();

        // Editing reservation information
        System.out.println("\nEdit Reservation 1 Information:");
        System.out.print("Enter new customer name: ");
        reservation1.setCustomerName(scanner.nextLine());
        System.out.print("Enter new flight number: ");
        reservation1.setFlightNumber(scanner.nextLine());
        System.out.print("Enter new price: ");
        reservation1.setPrice(scanner.nextDouble());
        scanner.nextLine();  // Consume newline

        System.out.println("\nUpdated Reservation 1 Information:");
        System.out.println(reservation1.getInfo());

        scanner.close();
    }
}
