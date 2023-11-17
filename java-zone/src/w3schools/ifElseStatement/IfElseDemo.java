package w3schools.ifElseStatement;

public class IfElseDemo {
    public static void main(String[] args) {
        // if statement
        if (20 > 18) {
            System.out.println("20 is greather than 18");
        }

        int x = 30;
        int y = -30;

        if (x > y) {
            System.out.println("x is greather than y");
        }

        // else statement
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        // in if ternary
        String resultOne = (time < 18) ? "Good day." : "Good evening.";
        System.out.println("Result ternary one: " + resultOne);

        // else .. if statement
        int number = 22;
        if (number < 10) {
            System.out.println("Good morning.");
        } else if (number > 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // Ternary operator
        int myAge = 18;
        int votingAge = 16;
        String result = (myAge >= votingAge) ? "Old enough to vote!" : "Not old enough to vote!";
        System.out.println(result);
    }
}