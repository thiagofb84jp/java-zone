package treemap;

import java.util.TreeMap;

public class Exercise03 {
    /**
     * 3. Write a Java program to get the portion of a map whose keys are strictly less than a given key.
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
        System.out.println("Value is: " + treeMap.headMap(10));
        System.out.println("Checking the entry for 30: ");
        System.out.println("Value is: " + treeMap.headMap(30));
        System.out.println("Checking the entry for 70: ");
        System.out.println("Value is: " + treeMap.headMap(70));
    }
}
