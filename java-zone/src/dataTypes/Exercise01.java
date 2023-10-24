package dataTypes;

import java.util.Scanner;

public class Exercise01 {
    /***
     * 1. Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = ((5 * (fahrenheit - 32)) / 9);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in celsius.");
    }
}
