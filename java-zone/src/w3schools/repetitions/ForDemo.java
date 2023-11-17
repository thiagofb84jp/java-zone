package w3schools.repetitions;

public class ForDemo {
    public static void main(String[] args) {
        // simple 'For' statement
        for (int i = 0; i < 10; i++) {
            System.out.println("Yes"); // it will print 'Yes' 10 times
        }

        // Using 'For' and 'Continue' statement
        System.out.println();
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println();
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("We come to number " + i);
            }
            System.out.println(i);
        }

        System.out.println();
        // print all numbers between 0 and 10
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println();
        // print only number pairs
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }

        // inner loop example
        System.out.println();
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // it will execute two times
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); // it will execute 6 times (2 * 3)
            }
        }
    }
}