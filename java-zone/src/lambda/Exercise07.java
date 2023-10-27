package lambda;

import java.util.function.LongUnaryOperator;

public class Exercise07 {
    /**
     * 7. Write a lambda expression to implement a lambda expression to calculate the factorial of a given number.
     */
    public static void main(String[] args) {
        LongUnaryOperator factorial = n -> {
            long result = 1;

            for (long i = 1; i <= n; i++) {
                result *= i;
            }

            return result;
        };

        long n = 7;
        long factorialResult = factorial.applyAsLong(n);

        System.out.println("Factorial of " + n + " is: " + factorialResult);
    }
}
