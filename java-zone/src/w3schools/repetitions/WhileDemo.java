package w3schools.repetitions;

public class WhileDemo {
    public static void main(String[] args) {

        // While examples
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        int x = 1, sum = 0;
        while (x <= 10) {
            sum += x; // sum = sum + x;
            x++;
        }
        System.out.println("Summation: " + sum);

        // Do .. While examples
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);

        int j = 1, soma = 0;
        do {
            soma += j;
            j++;
        } while (j <= 10);
        System.out.println("Summation: " + soma);
    }
}
