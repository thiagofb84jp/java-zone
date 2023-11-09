package w3schools.exercises.dataTypes;

public class NumbersAndStrings {
    public static void main(String[] args) {
        // Integer types
        byte byteNum = 100;
        System.out.println(byteNum);

        short shortNum = 5000;
        System.out.println(shortNum);

        int intNum = 100000;
        System.out.println(intNum);

        long longNum = 15000000000L;
        System.out.println(longNum);

        // Floating types
        float floatNum = 5.75F;
        System.out.println(floatNum);

        double doubleNum = 19.99D;
        System.out.println(doubleNum);

        // Scientific numbers
        float f1 = 35e3f;
        double d1 = 12E4d;

        System.out.println(f1);
        System.out.println(d1);

        // Boolean types
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        // Characters and Strings
        char myChar = 'Z';
        System.out.println(myChar);

        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        String greeting = "Hello World";
        System.out.println(greeting);
    }
}