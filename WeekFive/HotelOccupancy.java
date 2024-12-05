package WeekFive;

import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        int numberOfFloors;
        int totalRooms = 0;
        int totalOccupiedRooms = 0;

        // Ask for the number of floors
        System.out.print("Enter the number of floors in the hotel: ");
        numberOfFloors = scanner.nextInt();

        // Loop through each floor
        for (int i = 1; i <= numberOfFloors; i++) {
            // Ask for the number of rooms on the floor
            System.out.print("Enter the number of rooms on floor " + i + ": ");
            int roomsOnFloor = scanner.nextInt();

            // Ask for the number of occupied rooms on that floor
            System.out.print("Enter the number of occupied rooms on floor " + i + ": ");
            int occupiedRooms = scanner.nextInt();

            // Update total rooms and total occupied rooms
            totalRooms += roomsOnFloor;
            totalOccupiedRooms += occupiedRooms;
        }

        // Calculate vacant rooms and occupancy rate
        int vacantRooms = totalRooms - totalOccupiedRooms;
        double occupancyRate = (double) totalOccupiedRooms / totalRooms * 100;

        // Print results
        System.out.println("\nHotel Occupancy Report:");
        System.out.println("Number of floors: " + numberOfFloors);
        System.out.println("Total number of rooms: " + totalRooms);
        System.out.println("Total number of occupied rooms: " + totalOccupiedRooms);
        System.out.println("Total number of vacant rooms: " + vacantRooms);
        System.out.printf("Occupancy rate: %.2f%%\n", occupancyRate);

        // Close the scanner
        scanner.close();
    }
}