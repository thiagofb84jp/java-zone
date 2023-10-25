package treemap;

import java.util.TreeMap;

public class Exercise01 {
    /**
     * 1. Write a Java program to get a key-value mapping associated with the greatest key less than or equal
     * to the given key.
     */
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(10, "Red");
        treeMap.put(20, "Pink");
        treeMap.put(30, "Black");
        treeMap.put(40, "Grey");
        treeMap.put(50, "Orange");
        treeMap.put(60, "Blue");

        System.out.println("Original TreeMap content: " + treeMap);
        System.out.println("Checking the entry for 10: ");
        System.out.println("Value is: " + treeMap.floorEntry(10));
        System.out.println("Checking the entry for 30: ");
        System.out.println("Value is: " + treeMap.floorEntry(30));
        System.out.println("Checking the entry for 70: ");
        System.out.println("Value is: " + treeMap.floorEntry(70));
    }
}
