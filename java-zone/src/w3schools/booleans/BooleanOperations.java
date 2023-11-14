package w3schools.booleans;

public class BooleanOperations {
    public static void main(String[] args) {
        // using directly
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        // using as comparison operation
        int x = 10;
        int y = 20;
        System.out.println(x > y); // it will return false because 10 is lower than 20
        // or just like this
        System.out.println(10 > 9); // it will return true because 10 is higher than 9

        int z = 55;
        System.out.println(z == 10); // it will return false because the value of z is not 10

        // complete use of boolean operator (with 'if' statement)
        int myAge = 17;
        int votingAge = 18;
        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote!");
        }
    }
}
