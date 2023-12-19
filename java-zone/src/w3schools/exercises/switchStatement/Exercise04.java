package w3schools.exercises.switchStatement;

import java.util.Scanner;

public class Exercise04 {
    /**
     * 4 - Write a program to Find the number of days in a month using a switch statement.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days;

        System.out.print("Enter the month number: ");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Number of days is 31.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Number of days is 30.");
                break;
            case 2:
                System.out.println("Number of days is 28.");
                break;
            default:
                System.out.println("Invalid... please, enter the 1 to 12.");
                break;
        }
    }
}
