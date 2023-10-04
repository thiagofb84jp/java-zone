package structureDecision;

import java.util.Scanner;

public class Exercise01 {
    /***
     * 1. Faça um Programa que peça dois números e imprima o maior deles.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        validarMaiorNumero(num1, num2);
    }

    private static void validarMaiorNumero(int num1, int num2) {
        System.out.println((num1 > num2) ? "O " + num1 + " é maior que " + num2
                : "O " + num2 + " é maior que " + num1);
    }
}
