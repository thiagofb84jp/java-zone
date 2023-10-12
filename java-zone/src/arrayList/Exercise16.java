package arrayList;

import java.util.ArrayList;

public class Exercise16 {
    /***
     * 16. Write a Java program to remove the third element from an array list.
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(9);
        numbers.add(12);
        numbers.add(88);
        numbers.add(50);
        numbers.add(88);

        System.out.println("Numbers list: " + numbers);

        numbers.remove(2);

        System.out.println("Numbers list updated: " + numbers);
    }
}