package treemap;

import java.util.TreeMap;

public class Exercise05 {
    /**
     * 5. Write a Java program to get the least key strictly greater than the given key. Return null if
     * there is no such key.
     */
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(10, "Red");
        treeMap.put(20, "Pink");
        treeMap.put(30, "Black");
        treeMap.put(40, "Grey");
        treeMap.put(50, "Orange");
        treeMap.put(60, "Blue");
        treeMap.put(70, "Yellow");
        treeMap.put(80, "Purple");

        System.out.println("Original TreeMap content: " + treeMap);
        System.out.println("Checking the entry for 10: ");
        System.out.println("Value is: " + treeMap.higherEntry(10));
        System.out.println("Checking the entry for 30: ");
        System.out.println("Value is: " + treeMap.higherEntry(20));
        System.out.println("Checking the entry for 70: ");
        System.out.println("Value is: " + treeMap.higherEntry(70));
    }
}
