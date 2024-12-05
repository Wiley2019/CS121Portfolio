package fileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileAppend {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "courses.txt"; // The name of the file to append data to

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            // Ask user for input to append
            System.out.print("Enter course name: ");
            String courseName = scanner.nextLine();

            System.out.print("Enter instructor's name: ");
            String instructor = scanner.nextLine();

            System.out.print("Enter course credits: ");
            int credits = scanner.nextInt();

            // Append the user input to the file
            writer.write(courseName + ", " + instructor + ", " + credits);
            writer.newLine();

            System.out.println("Data appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}