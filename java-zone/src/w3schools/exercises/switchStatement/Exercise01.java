package w3schools.exercises.switchStatement;

import com.sun.source.tree.BindingPatternTree;

import java.util.Scanner;

public class Exercise01 {
    /**
     * 1 - Write a program to read a weekday number and print weekday name using switch statement.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = 0;

        System.out.print("Enter the Weekday number: ");
        day = scanner.nextInt();

        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid... Please, enter the 0 to 6...");
                break;
        }
    }
}
