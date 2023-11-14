package w3schools.exercises.decisionStructure;

import java.util.Scanner;

public class Exercise05 {
    /**
     * 5. Faça um Programa que leia três números e mostre o maior deles.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int x = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int y = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        int z = scanner.nextInt();

        if ((x > y) && (x > z)) {
            System.out.println(x + " é o maior número");
        } else if ((y > x) && (y > z)) {
            System.out.println(y + " é o maior número");
        } else {
            System.out.println(z + " é o maior número");
        }
    }
}