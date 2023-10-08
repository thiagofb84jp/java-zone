package arrayList;

import java.util.ArrayList;

public class Exercise13 {
    /***
     * 13. Write a Java program to insert an element into the array list at the first position.
     */
    public static void main(String[] args) {
        ArrayList<String> elements = new ArrayList<String>();
        elements.add("Book");
        elements.add("Beer");
        elements.add("Pencil");
        elements.add("Pen");
        elements.add("Notebook");

        System.out.println("Array list elements: " + elements);

        elements.add(0, "Ebook");
        elements.add(4, "Macbook");

        System.out.println("New array list elements: " + elements);
    }
}
