package w3schools.operators;

public class Operators {
    public static void main(String[] args) {
        // Arithmetics
        int num1 = 10, num2 = 20, num3 = 30, sum, sub, mult, div, mod;
        sum = num1 + num2 + num3;
        sub = num1 - num2 - num3;
        mult = num1 * num2 * num3;
        div = (num1 + num2 + num3) / 3;
        mod = (num2 + num1) % 10;

        System.out.println("Sum = " + sum);
        System.out.println("Subtraction = " + sub);
        System.out.println("Multiplication = " + mult);
        System.out.println("Division = " + div);
        System.out.println("Modulus = " + mod);

        // Increment and Decrement
        int a = 1, c = 3;
        c += a; // c = c + a;
        System.out.println("Incrementing = " + c); // 4

        c -= a; // c = c - a;
        System.out.println("Decrementing = " + c); // 3

        // Assignment
        int num;
        String name;

        num = 10;
        name = "Jack Cole Smith";

        System.out.println(num);
        System.out.println(name);

        // Comparison
        int x = 10;
        int y = 5;
        int d = 90;
        int e = 50;

        System.out.println(x > y); // true
        System.out.println(e == d); // false

        // Logical operators
        float f = 0.99F, g = 6.551F;
        if ((g > f) && (x > y)) {
            System.out.println("Everything is fine.");
        } else {
            System.out.println("Not everthing is fine.");
        }

        // Bitwise
        int h = 6, i = 5, result;
        result = h & i;
        System.out.println(result);

        result = h ^ i;
        System.out.println(result);

        System.out.println(~result);
    }
}