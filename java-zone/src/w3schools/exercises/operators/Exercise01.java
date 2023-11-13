package w3schools.exercises.operators;

public class Exercise01 {
    /**
     * 1. Write a Java program to get whole and fractional parts from a double value.
     */
    public static void main(String[] args) {
        double value = 12.56D;
        double fractionalValue = value % 1;
        double integralPart = value - fractionalValue;

        System.out.println("Original value: " + value);
        System.out.println("Integral part: " + integralPart);
        System.out.println("Fractional part: " + fractionalValue);
    }
}
