package linkedListActivity;

import java.util.LinkedList;

public class PropertyListing {
    private String address;
    private double price;
    private String propertyType;
    private LinkedList<String> viewingHistory;

    // Constructor
    public PropertyListing(String address, double price, String propertyType) {
        this.address = address;
        this.price = price;
        this.propertyType = propertyType;
        this.viewingHistory = new LinkedList<>();
    }

    // Method to add a viewing appointment
    public void addViewing(String appointment) {
        viewingHistory.add(appointment);
    }

    // Method to remove the oldest viewing from the list
    public void removeViewing() {
        if (!viewingHistory.isEmpty()) {
            viewingHistory.removeFirst();
        } else {
            System.out.println("No viewings to remove.");
        }
    }

    // Method to get property information
    public String getPropertyInfo() {
        return "Address: " + address + ", Price: $" + price + ", Type: " + propertyType;
    }

    // Method to display viewing history
    public void displayViewingHistory() {
        System.out.println("Viewing History for " + address + ":");
        if (viewingHistory.isEmpty()) {
            System.out.println("No viewings scheduled.");
        } else {
            for (String viewing : viewingHistory) {
                System.out.println(viewing);
            }
        }
    }

    // Getters and setters for address, price, and propertyType
    public void setAddress(String address) {
        this.address = address;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }
}
