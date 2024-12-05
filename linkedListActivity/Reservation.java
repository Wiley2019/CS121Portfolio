package linkedListActivity;

import java.util.LinkedList;

public class Reservation {
    private String customerName;
    private String flightNumber;
    private double price;
    private LinkedList<String> reservations;

    // Constructor
    public Reservation(String customerName, String flightNumber, double price) {
        this.customerName = customerName;
        this.flightNumber = flightNumber;
        this.price = price;
        this.reservations = new LinkedList<>();
    }

    // Method to add a reservation entry
    public void addEntry(String entry) {
        reservations.add(entry);
    }

    // Method to remove the oldest reservation
    public void removeEntry() {
        if (!reservations.isEmpty()) {
            reservations.removeFirst();
        } else {
            System.out.println("No reservations to remove.");
        }
    }

    // Method to get reservation information
    public String getInfo() {
        return "Customer: " + customerName + ", Flight: " + flightNumber + ", Price: $" + price;
    }

    // Method to display all reservations
    public void displayEntries() {
        System.out.println("Reservations for " + customerName + ":");
        if (reservations.isEmpty()) {
            System.out.println("No reservations made.");
        } else {
            for (String reservation : reservations) {
                System.out.println(reservation);
            }
        }
    }

    // Getters and setters for customerName, flightNumber, and price
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
