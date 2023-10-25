package arrayList;

import java.util.ArrayList;

public class Exercise22 {
    /**
     * 22. Write a Java program to replace the second element of an ArrayList with the specified element.
     */
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");

        System.out.println("Original array list: " + colors);

        String newColor = "White";
        colors.set(1, newColor);
        System.out.println("Replacing the second element with " + newColor);

        colors.forEach(i -> System.out.println(i));
    }
}
