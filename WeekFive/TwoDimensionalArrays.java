package WeekFive;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        // 1. Creating a 2-dimensional array1 of ints
        int[][] array1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        // Printing array1 elements using a standard for loop
        System.out.println("Array1 elements:");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each inner array
        }

        // 2. Creating a 2-dimensional array2 of doubles
        double[][] array2 = new double[4][3]; // 4 inner arrays, 3 elements each
        array2[0][0] = 1.1; array2[0][1] = 1.2; array2[0][2] = 1.3;
        array2[1][0] = 2.1; array2[1][1] = 2.2; array2[1][2] = 2.3;
        array2[2][0] = 3.1; array2[2][1] = 3.2; array2[2][2] = 3.3;
        array2[3][0] = 4.1; array2[3][1] = 4.2; array2[3][2] = 4.3;

        // Printing array2 elements using an enhanced for loop
        System.out.println("Array2 elements:");
        for (double[] innerArray : array2) {
            for (double value : innerArray) {
                System.out.print(value + " ");
            }
            System.out.println(); // Move to the next line after each inner array
        }

        // 3. Creating a 2-dimensional array of Strings
        String[][] array3 = {
                {"Hello", "World", "Java"},
                {"Array", "Example", "Test"}
        };

        // Printing array3 elements using a standard for loop
        System.out.println("Array3 elements:");
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                System.out.print(array3[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each inner array
        }
    }
}