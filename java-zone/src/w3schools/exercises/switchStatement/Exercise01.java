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

        System.out.println("Enter the Weekday number: ");
        day = scanner.nextInt();

        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
        }
    }
}
