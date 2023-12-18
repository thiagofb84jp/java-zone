package w3schools.exercises.math;

import java.util.Scanner;

public class Exercise05 {
    /**
     * 5 - Write a Java program to check if a given number is Fibonacci number or not.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Is Fibonacci number? " + isFibonacci(number));
        }
    }

    private static boolean isPerfectSquare(int number) {
        int square = (int) Math.sqrt(number);
        return square * square == number;
    }

    private static boolean isFibonacci(int number) {
        return isPerfectSquare(5 * number * number + 4) || isPerfectSquare(5 * number * number - 4);
    }
}