package w3schools.exercises.decisionStructure;

import java.util.Scanner;

public class Exercise01 {
    /**
     * 1. Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int x = scanner.nextInt();

        String result = (x < 0) ? "O número " + x + " é negativo." : "O número " + x + " é positivo.";
    }
}