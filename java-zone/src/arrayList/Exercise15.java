package arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Exercise15 {
    /***
     * 15. Write a Java program to update an array element by the given element.
     */
    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<String>();
        groceries.add("Water Mellow");
        groceries.add("Cashew");
        groceries.add("Banana");
        groceries.add("Orange");
        groceries.add("Water");
        groceries.add("Meat");

        System.out.println("List of groceries: " + groceries);

        groceries.set(2, "Lemon");

        System.out.println("List of groceries updated: " + groceries);
    }
}
