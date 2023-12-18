package w3schools.exercises.math;

import java.util.Scanner;

public class Exercise02 {
    /**
     * 2 - Write a Java method to compute the average of three numbers.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the number 2: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the number 3: ");
        int num3 = scanner.nextInt();

        int average = (num1 + num2 + num3) / 3;

        System.out.println("The average value is: " + (average));
    }
}
