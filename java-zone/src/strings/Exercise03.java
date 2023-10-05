package strings;

public class Exercise03 {
    /***
     * 3.  Write a Java program to get the character (Unicode code point) before the specified
     *      index within the string.
     */
    public static void main(String[] args) {
        String str = "w3resources.com";

        System.out.println("Original String: " + str);

        // codePointBefore() method returns the Unicode value of the character before the specified index in a string
        // in this case, it will get the respective unicodes of 1 and 9
        int val1 = str.codePointBefore(1);
        int val2 = str.codePointBefore(9);

        System.out.println("Character (unicode point) = " + val1);
        System.out.println("Character (unicode point) = " + val2);
    }
}
