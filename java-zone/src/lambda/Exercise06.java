package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise06 {
    /**
     * 6. Write a Java program to implement a lambda expression to remove duplicates from a list of integers.
     */
    public static void main(String[] args) {
        List<Integer> listOne = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 8, 9, 10, 5, 10, 5, 7, 1, 5, 2, 3, 9, 8);
        System.out.println("\nPrinting the list elements: " + listOne);

        List<Integer> listTwo = new ArrayList<Integer>();
        listOne.stream().distinct().forEach(listTwo::add);

        System.out.println("\nList elements without duplicates: " + listTwo);
    }
}