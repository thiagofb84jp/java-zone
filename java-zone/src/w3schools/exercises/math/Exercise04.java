package w3schools.exercises.math;

import java.util.Scanner;

public class Exercise04 {
    /**
     * 4 - Write a Java program to convert a float value to absolute value.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Float number: ");
        float number = scanner.nextFloat();

        float absValue = (number >= 0) ? number : -number;

        System.out.println("Given value: " + number);
        System.out.println("Convert Float to Absolute value: " + absValue);
    }
}
