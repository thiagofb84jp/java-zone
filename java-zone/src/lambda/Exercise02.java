package lambda;

import java.util.function.Predicate;

public class Exercise02 {
    /**
     * 2. Write a Java program to implement a lambda expression to check if a given
     * string is empty.
     */
    public static void main(String[] args) {
        String stringNull = "";
        Predicate isEmptyString = str -> stringNull.isEmpty();

        String str1 = "";
        String str2 = "Java lambda expression!";

        System.out.println("String 1: " + str1);
        System.out.println("String 1 is empty: " + isEmptyString.test(str1));
        System.out.println("String 2: " + str2);
        System.out.println("String 2 is empty: " + isEmptyString.test(str2));
    }
}
