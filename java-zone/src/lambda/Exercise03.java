package lambda;

import java.util.Arrays;
import java.util.List;

public class Exercise03 {
    /**
     * 3. Write a Java program to implement a lambda expression to convert a list of strings to uppercase
     * and lowercase.
     */
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Red", "Green", "blue", "Orange", "Yellow", "PINK");

        System.out.println("\nOriginal strings: ");
        list.forEach(str -> System.out.println(str));
        list.replaceAll(str -> str.toLowerCase());

        System.out.println("\nLowercase strings: ");
        list.forEach(str -> System.out.println(str));
        list.replaceAll(str -> str.toUpperCase());

        System.out.println("\nUppercase strings: ");
        list.forEach(str -> System.out.println(str));
    }
}
