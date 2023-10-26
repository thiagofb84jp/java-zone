package lambda;

public class Exercise01 {
    /**
     * 1. Write a Java program to implement a lambda expression to find the sum of two integers.
     */
    public static void main(String[] args) {
        SumCalculator sumCalculator = (x, y) -> x + y;

        int result = sumCalculator.sum(7, 6);
        System.out.println("Sum of 7 and 6 is: " + result);

        result = sumCalculator.sum(15, -35);
        System.out.println("Sum of 15 and -35 is: " + result);
    }
}
