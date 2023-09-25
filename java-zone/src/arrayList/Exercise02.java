package arrayList;

import java.util.Arrays;

public class Exercise02 {
    /**
     * 2. Write a Java program to sum values of an array
     */
    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i: myArray) {
            sum += i;
        }

        System.out.println("The sum is: " + sum);
    }

    public void otherWayToSumAnArray() {
        int[] myArray = {10, 20, 30, 40, 50};

        int sum = Arrays.stream(myArray).sum();

        System.out.println("Sum of array is: " + sum);
    }
}
