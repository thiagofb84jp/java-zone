package w3schools.exercises.operators;

public class Exercise02 {
    /**
     * 2. Write a Java program to test if a double number is an integer.
     */
    public static void main(String[] args) {
        double number = 5.44444;

        if ((number % 1) == 0) {
            System.out.println("It's not a double number.");
        } else {
            System.out.println("It's a double number.");
        }
    }
}
