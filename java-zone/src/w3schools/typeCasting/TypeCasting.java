package w3schools.typeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        // Automatic casting: int to double
        int x = 9;
        double y = x;

        System.out.println(x);
        System.out.println(y);

        // Manual casting: double to int
        double a = 9.78D;
        int b = (int) a;

        System.out.println(a);
        System.out.println(b);
    }
}
