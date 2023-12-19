package w3schools.exercises.switchStatement;

import java.util.Scanner;

public class Exercise03 {
    /**
     * 3 - Write a program to Check whether the number is even or odd using switch statement.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number: ");
        int number = scanner.nextInt();

        switch (number % 2) {
            case 0:
                System.out.println("This is an even number.");
                break;
            case 1:
                System.out.println("This is an odd number.");
                break;
        }
    }
}
