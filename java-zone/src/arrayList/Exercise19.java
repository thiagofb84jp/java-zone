package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise19 {
    /**
     * 19. Write a Java program to copy one array list into another
     */
    public static void main(String[] args) {
        List<String> listOne = new ArrayList<String>();
        listOne.add("1");
        listOne.add("2");
        listOne.add("3");
        listOne.add("4");
        listOne.add("5");
        System.out.println("List One: " + listOne);

        List<String> listTwo = new ArrayList<String>();
        listTwo.add("A");
        listTwo.add("B");
        listTwo.add("C");
        listTwo.add("D");
        listTwo.add("E");
        System.out.println("List Two: " + listTwo);

        Collections.copy(listOne, listTwo);

        System.out.println("Copy List One to List Two... \nAfter copy: ");
        System.out.println("List One: " + listOne);
        System.out.println("List Two: " + listTwo);
    }
}
