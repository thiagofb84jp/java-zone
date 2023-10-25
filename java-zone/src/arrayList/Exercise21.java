package arrayList;

import java.util.ArrayList;

public class Exercise21 {
    /**
     * 21. Write a Java program to print all the elements of an ArrayList using the elements' position.
     */
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Pink");
        colors.add("Grey");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("White");

        System.out.println("Original array list elements: " + colors);
        System.out.println("\nPrint using index of an element: ");

        colors.forEach(i -> System.out.println(i));

//        for (int i = 0; i < color.size(); i++) {
//            System.out.println(color.get(i));
//        }

//        for(String i: color) {
//            System.out.println(i);
//        }
    }
}