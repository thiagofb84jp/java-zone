package w3schools.methods;

public class MethodsDemoTwo {

    public static void main(String[] args) {
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");

        methodWithManyArguments("Liam", 5);
        methodWithManyArguments("Jenny", 8);
        methodWithManyArguments("Anja", 31);

        System.out.println(methodWithReturn(3));
        System.out.println(methodWithTwoParameters(5, 3));

        long z = methodWithTwoParameters(10, 20);
        System.out.println(z);

        checkAge(20);
    }

    // method with one parameter
    static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");
    }

    // method with more than one parameter
    static void methodWithManyArguments(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    //method with return (one parameter)
    static int methodWithReturn(int x) {
        return 5 + x;
    }

    //method with return with two parameters
    static long methodWithTwoParameters(int x, int y) {
        return x + y;
    }

    //method with if..else
    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}