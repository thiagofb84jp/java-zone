package strings;

public class Exercise05 {
    /***
     * 5. Write a Java program to compare two strings lexicographically.
     */
    public static void main(String[] args) {
        String str1 = "This is Exercise  5";
        String str2 = "This is Exercise  1";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        int result = str1.compareTo(str2);

        if (result < 0) {
            System.out.printf("\"%s\" is less than \"%s\"%n", str1, str2);
        } else if (result == 0) {
            System.out.printf("\"%s\" is equal to \"%s\"%n", str1, str2);
        } else {
            System.out.printf("\"%s\" is greater than \"%s\"%n", str1, str2);
        }
    }
}
