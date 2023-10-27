package lambda;

import java.util.Arrays;
import java.util.List;

public class Exercise05 {
    /**
     * 5. Write a Java program to implement a lambda expression to find the average of a list of doubles.
     */
    public static void main(String[] args) {
        List<Double> nums = Arrays.asList(3.4, 6.5, 88.1, 44.9, 11.2, 6.99);

        System.out.println("\nOriginal values: " + nums);

        double average = nums.stream()
                             .mapToDouble(Double::doubleValue)
                             .average()
                             .orElse(0.0);

        System.out.println("\nAverage of the original values: " + average);
    }
}
