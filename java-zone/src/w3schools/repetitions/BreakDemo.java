package w3schools.repetitions;

public class BreakDemo {
    public static void main(String[] args) {
        // using "for" statement
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
            if (i == 4) {
                break; // it will break the loop when it will come to the number 4
            }
        }
        System.out.println("End of the 'for' loop.");

        int i = 0;
        while (i < 10) {
            System.out.println("i = " + i);
            i++;
            if (i == 4) {
                break;
            }
        }
        System.out.println("End of the 'while' loop.");
    }
}

