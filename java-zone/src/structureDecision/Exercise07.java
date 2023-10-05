package structureDecision;

import java.util.Scanner;

public class Exercise07 {
    /**
     * 7. Faça um Programa que leia três números e mostre o maior e o menor deles.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        validarMaiorEMenorNumero(num1, num2, num3);
    }

    private static void validarMaiorEMenorNumero(int num1, int num2, int num3) {
        if ((num1 > num2) && (num1 > num3)) {
            System.out.println("O " + num1 + " é maior que os números " + num2 + " e " + num3);
        } else if ((num2 > num1) && (num2 > num3)) {
            System.out.println("O " + num2 + " é maior que os números " + num1 + " e " + num3);
        } else {
            System.out.println("O " + num3 + " é maior que os números " + num1 + " e " + num2);
        }

        if ((num1 < num2) && (num1 < num3)) {
            System.out.println("O " + num1 + " é menor que os números " + num2 + " e " + num3);
        } else if ((num2 < num1) && (num2 < num3)) {
            System.out.println("O " + num2 + " é menor que os números " + num1 + " e " + num3);
        } else {
            System.out.println("O " + num3 + " é menor que os números " + num1 + " e " + num2);
        }
    }
}
