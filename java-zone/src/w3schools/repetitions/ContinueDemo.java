package w3schools.repetitions;

public class ContinueDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue; // it will jump the number 4
            }
            System.out.println("i = " + i);
        }
        System.out.println("End of the 'for' loop.");

        int i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println("i = " + i);
            i++;
        }
        System.out.println("End of the 'while' loop.");
    }
}