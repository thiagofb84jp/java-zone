package arrayList;

public class Exercise04 {
    /**
     * 4. Write a Java program to calculate the average value of array elements.
     */
    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }

        double average = sum / myArray.length;
        System.out.println("Average value of the array elements is: " + average);
    }
}