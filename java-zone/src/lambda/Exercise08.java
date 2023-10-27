package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise08 {
    /**
     * 8. Write a Java program to implement a lambda expression to filter out even and odd numbers from a list
     * of integers.
     */
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(11, 23, 98, 34, 15, 32, 42, 80, 99, 100);
        System.out.println("\nOriginal numbers: ");
        nums.forEach(i -> System.out.println(i + " "));

        List<Integer> evenNumbers = nums.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("\nEven numbers: ");
        evenNumbers.forEach(i -> System.out.println(i + " "));

        List<Integer> oddNumbers = nums.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
        System.out.println("\nOdd numbers: ");
        oddNumbers.forEach(i -> System.out.println(i + " "));
    }
}
