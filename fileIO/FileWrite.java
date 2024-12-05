package fileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "courses.txt"; // The name of the file to write to

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            // Write the header
            writer.write("Course Name, Instructor, Credits");
            writer.newLine();

            // Ask user for input
            System.out.print("Enter course name: ");
            String courseName = scanner.nextLine();

            System.out.print("Enter instructor's name: ");
            String instructor = scanner.nextLine();

            System.out.print("Enter course credits: ");
            int credits = scanner.nextInt();

            // Write the user input to the file
            writer.write(courseName + ", " + instructor + ", " + credits);
            writer.newLine();

            System.out.println("Data written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}