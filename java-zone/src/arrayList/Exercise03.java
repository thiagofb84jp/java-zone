package arrayList;

import javax.swing.*;

public class Exercise03 {
    /**
     * 3. Write a Java program to print the following grid.
     */
    public static void main(String[] args) {
        int[][] myArray = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%2d ", myArray[i][j]);
            }
            System.out.println();
        }
    }
}