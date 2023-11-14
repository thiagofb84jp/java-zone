package w3schools.exercises.decisionStructure;

import java.util.Scanner;

public class Exercise07 {
    /**
     * 7. Write a Java program to compare two numbers.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Input the second integer: ");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Both numbers are equals.");
        }
        if (num1 != num2) {
            System.out.println("Both numbers are different.");
        }
        if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2);
        }
        if (num1 > num2) {
            System.out.println(num1 + " is higher than " + num2);
        }
    }
}
