package ArrayListDemo;

import java.util.Scanner;

public class TestCustomerInfo {
    public static void main(String[] args) {
        SystemManagement sm = new SystemManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter course name (or 'q' to quit): ");
            String course = scanner.nextLine();
            if (course.equalsIgnoreCase("q")) break;
            sm.addCourse(course);

            System.out.print("Enter GPA: ");
            Double gpa = scanner.nextDouble();
            sm.addGpa(gpa);

            System.out.print("Enter score: ");
            Integer score = scanner.nextInt();
            sm.addScore(score);
            scanner.nextLine(); // Consume the newline
        }

        // Display information
        sm.displayCourses();
        sm.displayGpas();
        sm.displayScores();

        scanner.close();
    }
}