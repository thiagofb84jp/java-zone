package structureDecision;

import java.util.Scanner;

public class Exercise02 {
    /**
     * 2.Faça um Programa que peça um valor e mostre na tela se o valor
     * é positivo ou negativo.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        validarSeEhPositivoOuNegativo(num);
    }

    private static void validarSeEhPositivoOuNegativo(int num) {
        System.out.print((num >= 0) ? "O número " + num + " é positivo."
                : "O número " + num + " é negativo.");
    }
}