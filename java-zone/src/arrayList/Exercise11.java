package arrayList;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class Exercise11 {
    /**
     * 11. Write a Java program to create an array list, add some colors (strings) and print out the collection.
     */
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Black");
        colors.add("White");
        colors.add("Grey");
        colors.add("Yellow");

        System.out.println("Printing the array collection: " + colors);
    }
}
