package treemap;

import java.util.TreeMap;

public class Exercise04 {
    /**
     * 4. Write a Java program to get the portion of this map whose keys are less than (or equal to,
     * if inclusive is true) a given key.
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
        System.out.println("Value is: " + treeMap.headMap(10, true));
        System.out.println("Checking the entry for 30: ");
        System.out.println("Value is: " + treeMap.headMap(20, true));
        System.out.println("Checking the entry for 70: ");
        System.out.println("Value is: " + treeMap.headMap(70, true));
    }
}
