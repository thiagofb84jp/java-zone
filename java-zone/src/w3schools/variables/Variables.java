package w3schools.variables;

public class Variables {

    public static void main(String[] args) {
        //String and primitive types
        String name = "Thiago";
        int number = 10;
        float floatingValue = 16.24F;
        char anyValue = 'A';
        boolean isTrue = true;
        byte singleValue = 9;

        //Values that can be declared later
        int myNumber;
        float myFloatNumber;
        char myAnyValue;

        myNumber = 15;
        System.out.println(myNumber);

        //Overwriting the previous value
        int myNum = 15;
        myNum = 20;
        System.out.println(myNum);

        //Final variables
        final int myFinalVariable = 10;
        System.out.println(myFinalVariable);
    }
}