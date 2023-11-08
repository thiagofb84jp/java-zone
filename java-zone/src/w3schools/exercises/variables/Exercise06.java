package w3schools.exercises.variables;

import java.util.Scanner;

public class Exercise06 {
    /**
     * 6. Write a Java program that takes five numbers as input to calculate and print the average of the numbers.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Input the third number: ");
        int num3 = scanner.nextInt();
        System.out.print("Input the fourth number: ");
        int num4 = scanner.nextInt();
        System.out.print("Input the fifth number: ");
        int num5 = scanner.nextInt();

        double average = (double) (num1 + num2 + num3 + num4 + num5) / 5;

        System.out.println("Total: " + average);
    }
}
