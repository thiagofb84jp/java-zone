package w3schools.exercises.Strings;

import interfaces.shape.Main;

public class Exercise06 {
    /**
     * 6. Write a Java program to read two strings append them together and return the result. If the strings
     * are different lengths, remove characters from the beginning of the longer string and make them
     * equal lengths.
     */
    public static void main(String[] args) {
        String str1 = "Welcome";
        String str2 = "home";

        System.out.println("The given strings is: " + str1 + " and " + str2);
        System.out.println("The new string is: " + minCat(str1, str2));
    }

    private static String minCat(String str1, String str2) {
        if (str1.length() == str2.length()) {
            return str1 + str2;
        }
        if (str1.length() > str2.length()) {
            int diff = str1.length() - str2.length();
            return str1.substring(diff, str1.length()) + str2;
        } else {
            int diff = str2.length() - str1.length();
            return str1 + str2.substring(diff, str2.length());
        }
    }
}