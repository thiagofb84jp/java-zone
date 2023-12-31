package arrayList;

import java.util.Arrays;

public class Exercise10 {
    /**
     * 10. Write a Java program to find the maximum and minimum value of an array.
     */

    static int max;
    static int min;

    public static void main(String[] args) {
        int[] myArray = {999,25, 14, 56, 15, 36, 56, 77, 18, 29, 49, 1, 2, -1, -992, 1002};

        maxMin(myArray);

        System.out.println("Original Array: " + Arrays.toString(myArray));
        System.out.println("Maximum value for the above array = " + max);
        System.out.println("Minimum value for the above array = " + min);
    }

    public static void maxMin(int myArray[]) {
        max = myArray[0];
        min = myArray[0];
        int len;

        len = myArray.length;
        for (int i = 0; i < len - 1; i = i + 2) {
            if (i + 1 > len) {
                if (myArray[i] > max)
                    max = myArray[i];
                if (myArray[i] < min)
                    min = myArray[i];
            }
            if (myArray[i] > myArray[i + 1]) {
                if (myArray[i] > max)
                    max = myArray[i];
                if (myArray[i + 1] < min)
                    min = myArray[i + 1];
            }
            if (myArray[i] < myArray[i + 1]) {
                if (myArray[i] < min)
                    min = myArray[i];
                if (myArray[i + 1] > max)
                    max = myArray[i + 1];
            }
        }
    }
}