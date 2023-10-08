package arrayList;

import java.util.ArrayList;

public class Exercise12 {
    /**
     * 12. Write a Java program to iterate through all elements in an array list.
     */
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Black");
        colors.add("White");
        colors.add("Grey");
        colors.add("Yellow");

        for (String element : colors) {
            System.out.println(element);
        }
    }
}
