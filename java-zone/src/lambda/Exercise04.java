package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise04 {
    /**
     * 4. Write a Java program to implement a lambda expression to sort a list of strings in
     * alphabetical order.
     */
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("red", "green", "orange", "blue", "black");

        System.out.println("\nOriginal strings: ");
        colors.forEach(color -> System.out.println(color));

        colors.sort((str1, str2) -> str1.compareToIgnoreCase(str2));

        System.out.println("\nSorted strings: ");
        colors.forEach(color -> System.out.println(color));
    }
}