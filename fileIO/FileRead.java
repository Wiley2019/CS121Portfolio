package fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

    public static void main(String[] args) {
        String fileName = "courses.txt"; // The name of the file to read

        // Use try-with-resources to automatically close the reader
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            // Read each line and print it
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}