package arrayList;

import java.util.ArrayList;

public class Exercise17 {
    /***
     * 17. Write a Java program to search for an element in an array list.
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(300);
        numbers.add(51);
        numbers.add(90);
        numbers.add(8);
        numbers.add(1);

        System.out.println("Numbers list: " + numbers);

        if (numbers.contains(300)) {
            System.out.println("Found the element on the list.");
        } else {
            System.out.println("There is no such element on the list.");
        }
    }
}
