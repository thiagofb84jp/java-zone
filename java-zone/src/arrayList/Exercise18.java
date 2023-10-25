package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise18 {
    /***
     * 18. Write a Java program to sort a given array list.
     */
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Grey");
        colors.add("Green");
        colors.add("Black");

        System.out.println("Colors list: " + colors);

        Collections.sort(colors);

        System.out.println("Colors list sorted: " + colors);
    }
}
