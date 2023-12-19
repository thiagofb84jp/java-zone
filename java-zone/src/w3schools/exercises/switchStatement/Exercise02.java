package w3schools.exercises.switchStatement;

import java.util.Scanner;

public class Exercise02 {
    /**
     * 2 - Write a program to read gender and print the corresponding gender using switch statement.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the gender (M/F): ");
        String gender = scanner.nextLine();

        switch (gender.toUpperCase()) {
            case "M":
                System.out.println("Male");
                break;
            case "F":
                System.out.println("Female");
                break;
            default:
                System.out.println("Unspecifield Gender.");
                break;
        }

    }
}