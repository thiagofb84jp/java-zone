package w3schools.methods;

public class MethodsDemoTwo {

    public static void main(String[] args) {
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");

        methodWithManyArguments("Liam", 5);
        methodWithManyArguments("Jenny", 8);
        methodWithManyArguments("Anja", 31);
    }

    // method with one parameter
    static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");
    }

    static void methodWithManyArguments(String fname, int age) {
        System.out.println(fname + " is " + age);
    }
}
