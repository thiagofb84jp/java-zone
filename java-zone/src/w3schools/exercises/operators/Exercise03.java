package w3schools.exercises.operators;

import java.math.BigDecimal;

public class Exercise03 {
    /**
     * 3. Write a Java program to round a float number to specified decimals.
     */
    public static void main(String[] args) {
        float number = 451.3256412F;
        BigDecimal result;
        int decimalPlace = 4;

        BigDecimal bigDecimal = new BigDecimal(Float.toString(number));
        bigDecimal = bigDecimal.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);

        System.out.printf("Original number: %.7f\n", number);
        System.out.printf("Rounded upto 4 decimal: " + bigDecimal);
    }
}
