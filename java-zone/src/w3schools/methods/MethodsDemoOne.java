package w3schools.methods;

public class MethodsDemoOne {

    public static void main(String[] args) {
        methodToBeExecuted();
        methodToBeExecuted();
        methodToBeExecuted();
    }

    //create a method inside the class
    static void myMethod() {
        //code to be executed
    }

    static void methodToBeExecuted() {
        System.out.println("I just got executed!");
    }
}
