package WeekFive;
import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the number of elements for the arrays
        System.out.print("Enter the number of elements for the arrays: ");
        final int NUM_ELEMENTS = scanner.nextInt();

        // Declare 4 arrays with the above number
        int[] array1 = new int[NUM_ELEMENTS];
        int[] array2 = new int[NUM_ELEMENTS];
        int[] array3 = new int[NUM_ELEMENTS];
        int[] array4 = new int[NUM_ELEMENTS];

        // Initialize and print array1
        System.out.println("Enter " + NUM_ELEMENTS + " numbers for array1:");
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        System.out.print("Array1: ");
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        // Copy array1’s elements to array2 and print array2
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            array2[i] = array1[i];
        }

        System.out.print("Array2 (copied from Array1): ");
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        // Copy array1’s elements squared to array3 and print array3
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            array3[i] = array1[i] * array1[i];
        }

        System.out.print("Array3 (squared values from Array1): ");
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            System.out.print(array3[i] + " ");
        }
        System.out.println();

        // Copy array1’s elements in reverse order to array4 and print array4
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            array4[i] = array1[NUM_ELEMENTS - 1 - i];
        }

        System.out.print("Array4 (reversed from Array1): ");
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            System.out.print(array4[i] + " ");
        }
        System.out.println();

        scanner.close(); // Close the scanner
    }
}
