package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise20 {
    /**
     * 20. Write a Java program to shuffle elements in an array list.
     */
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();
        stringList.add("Red");
        stringList.add("Blue");
        stringList.add("Pink");
        stringList.add("Orange");
        stringList.add("Green");
        stringList.add("Black");

        System.out.println("Original list: " + stringList);

        Collections.shuffle(stringList);

        System.out.println("List after shuffling: \n" + stringList);
    }
}
