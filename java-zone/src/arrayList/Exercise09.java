package arrayList;

import java.util.Arrays;

public class Exercise09 {
    /**
     * 9. Write a Java program to insert an element (specific position) into an array.
     */
    public static void main(String[] args) {
        int[] myArray = {999, 25, 14, 56, 15, 36, 56, 77, 18, 29, 49, 1};
        int indexPosition = 2;
        int newValue = 10;

        System.out.println("Original Array: " + Arrays.toString(myArray));

        for (int i = myArray.length - 1; i > indexPosition; i--) {
            myArray[i] = myArray[i - 1];
        }

        myArray[indexPosition] = newValue;
        System.out.println("New Array: " + Arrays.toString(myArray));
    }
}
