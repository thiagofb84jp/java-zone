package w3schools.exercises.math;

import java.util.Scanner;

public class Exercise03 {
    /**
     * 3 - Write a Java method to count all words in a string.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = scanner.nextLine();

        int count = 0;
        if (!("".equals(str.substring(0, 1))) || !("".equals(str.substring(str.length() - 1)))) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
            count++;
        }
        System.out.println("Number of words in the string: " + count);
    }
}