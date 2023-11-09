package w3schools.strings;

public class StringsOne {
    public static void main(String[] args) {
        // String type
        String greetings = "Hello World! \nI'm implementing in Java!";

        // Length
        System.out.println("The length of the txt string is: " + greetings.length());

        //Uppercase and Lowercase
        System.out.println(greetings.toUpperCase());
        System.out.println(greetings.toLowerCase());

        // Find a character in a String
        String phrase = "Please locate where 'locate' occurs!";
        System.out.println(phrase.indexOf("locate")); // 7

        //Compare to
        String str1 = "Hello", str2 = "Hello", str3 = "Marcus";
        System.out.println(str1.compareTo(str2)); // it will return 0 because they're the same!

        //Concat
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName)); //concat the first string with the last one

        //Content equals
        String myStr = "Hello";
        System.out.println(myStr.contentEquals("Hello")); //true
        System.out.println(myStr.contentEquals("e")); //false
        System.out.println(myStr.contentEquals("Hi")); //false

        //Replace
        String str = "Hello";
        System.out.println(myStr.replace("l", "p"));

        //Trim (it will remove all the whitespaces on the string)
        String hello = "                                     Hello World!                              ";
        System.out.println(hello);
        System.out.println(hello.trim());
    }
}