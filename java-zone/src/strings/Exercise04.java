package strings;

public class Exercise04 {
    /***
     * 4. Write a Java program to count Unicode code points in the specified text range of a string.
     */
    public static void main(String[] args) {
        String str = "w3resources.com";

        System.out.println("Original String: " + str);

        // codePointCount() method returns the number of Unicode values found in a string
        // in this case, it will get the respective unicodes of 1 and 10
        int ctr = str.codePointCount(1, 10);

        System.out.println("Codepoint count: " + ctr);
    }
}
