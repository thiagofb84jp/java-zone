package w3schools.exercises.switchStatement;

import java.util.Scanner;

public class Exercise05 {
    /**
     * 5 - Write a program to create simple calculator using switch Statement.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double res;

        System.out.println("Enter the number 1: ");
        double number1 = scanner.nextDouble();
        System.out.println("Enter the number 2: ");
        double number2 = scanner.nextDouble();

        System.out.println("(+, -, * or /)");
        System.out.print("Choose an Operator: ");
        String operator = scanner.next();

        switch (operator) {
            case "+":
                res = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + res);
                break;
            case "-":
                res = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + res);
                break;
            case "*":
                res = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + res);
                break;
            case "/":
                res = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + res);
                break;
            default:
                System.out.println("Invalid Operator!");
                break;
        }
    }
}
