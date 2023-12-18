package w3schools.exercises.math;

import java.util.Scanner;

public class Exercise01 {
    /**
     * 1 - Write a Java method to find the smallest number among three numbers.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the number 2: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the number 3: ");
        int num3 = scanner.nextInt();

        System.out.println("The smallest value is: " + Math.min(Math.min(num1, num2), num3));
    }
}
