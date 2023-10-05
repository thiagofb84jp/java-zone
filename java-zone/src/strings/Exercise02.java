package strings;

public class Exercise02 {
    /**
     * 2. Write a Java program to get the character (Unicode code point) at the given index within the string.
     */
    public static void main(String[] args) {
        String str = "w3resources.com";

        System.out.println("Original String: " + str);

        // codePointAt() method returns the Unicode value of the character at the specified index in a string
        // in this case, it will get the respective unicodes of 1 and 9
        int val1 = str.codePointAt(1);
        int val2 = str.codePointAt(9);

        System.out.println("Character (unicode point) = " + val1);
        System.out.println("Character (unicode point) = " + val2);
    }
}
