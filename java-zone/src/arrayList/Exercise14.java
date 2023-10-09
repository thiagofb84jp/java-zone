package arrayList;

import java.util.ArrayList;

public class Exercise14 {
    /**
     * 14. Write a Java program to retrieve an element (at a specified index) from a given array list.
     */
    public static void main(String[] args) {
        ArrayList<String> computer = new ArrayList<String>();
        computer.add("Keyboard");
        computer.add("Screen");
        computer.add("Notebook");
        computer.add("Mic");
        computer.add("Mouse");

        System.out.println("Original list: " + computer);

        String item = computer.get(0);
        System.out.println("First element: " + item);

        item = computer.get(2);
        System.out.println("Third element: " + item);
    }
}