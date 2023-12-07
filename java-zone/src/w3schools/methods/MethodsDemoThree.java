package w3schools.methods;

public class MethodsDemoThree {

    public static void main(String[] args) {
        // here we have two methods that add numbers of different type
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);

        //here we have the overload methods
        int myNum3 = plusMethod(8, 5);
        double myNum4 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum3);
        System.out.println("double: " + myNum4);

    }

    /**
     * We have here two methods that add numbers of different type:
     */
    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    /**
     * Instead of defining two methods that should do the same thing, it is better to overload one
     * In the example below, we overload the "plusMethod" to work for both int and double types:
     */
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }
}
