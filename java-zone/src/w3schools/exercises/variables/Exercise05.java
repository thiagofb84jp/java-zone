package w3schools.exercises.variables;

import java.util.Scanner;

public class Exercise05 {
    /**
     * 5. Write a Java program that takes two numbers as input and displays the product of two numbers.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int num2 = scanner.nextInt();

        int product = num1 * num2;

        System.out.println("Total: " + product);
    }
}
