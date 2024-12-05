package ArrayListDemo;

import java.util.ArrayList;

public class SystemManagement {
    private ArrayList<String> courses;
    private ArrayList<Double> gpas;
    private ArrayList<Integer> scores;

    public SystemManagement() {
        courses = new ArrayList<>();
        gpas = new ArrayList<>();
        scores = new ArrayList<>();
    }

    // Add items to the lists
    public void addCourse(String course) {
        courses.add(course);
    }

    public void addGpa(Double gpa) {
        gpas.add(gpa);
    }

    public void addScore(Integer score) {
        scores.add(score);
    }

    // Remove items from the lists
    public void removeCourse(int index) {
        if (index >= 0 && index < courses.size()) {
            courses.remove(index);
        }
    }

    public void removeGpa(int index) {
        if (index >= 0 && index < gpas.size()) {
            gpas.remove(index);
        }
    }

    public void removeScore(int index) {
        if (index >= 0 && index < scores.size()) {
            scores.remove(index);
        }
    }

    // Get the size of the lists
    public int getCoursesSize() {
        return courses.size();
    }

    public int getGpasSize() {
        return gpas.size();
    }

    public int getScoresSize() {
        return scores.size();
    }

    // Get an element by index
    public String getCourse(int index) {
        return index >= 0 && index < courses.size() ? courses.get(index) : null;
    }

    public Double getGpa(int index) {
        return index >= 0 && index < gpas.size() ? gpas.get(index) : null;
    }

    public Integer getScore(int index) {
        return index >= 0 && index < scores.size() ? scores.get(index) : null;
    }

    // Display the list elements
    public void displayCourses() {
        System.out.println("Courses:");
        for (String course : courses) {
            System.out.println(course);
        }

        System.out.println("Using regular for loop:");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i));
        }
    }

    public void displayGpas() {
        System.out.println("GPAs:");
        for (Double gpa : gpas) {
            System.out.println(gpa);
        }

        System.out.println("Using regular for loop:");
        for (int i = 0; i < gpas.size(); i++) {
            System.out.println(gpas.get(i));
        }
    }

    public void displayScores() {
        System.out.println("Scores:");
        for (Integer score : scores) {
            System.out.println(score);
        }

        System.out.println("Using regular for loop:");
        for (int i = 0; i < scores.size(); i++) {
            System.out.println(scores.get(i));
        }
    }
}