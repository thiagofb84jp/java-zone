package strings;

import java.util.Scanner;

public class Exercise06 {
    /***
     * 6. Fac¸a um programa que entao leia uma string e a imprima
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, type a String: ");
        String phrase = scanner.next();

        System.out.println("Here's the String: " + phrase);
    }
}
