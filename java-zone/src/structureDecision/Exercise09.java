package structureDecision;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Exercise09 {
    /**
     * 9. Faça um Programa que leia três números e mostre-os em ordem decrescente.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Informe o segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Informe o terceiro número: ");
        int num3 = scanner.nextInt();

        if (num2 > num1) {
            int aux = num2;
            num2 = num1;
            num1 = aux;
        }

        if (num3 > num1) {
            int aux = num3;
            num3 = num1;
            num1 = aux;
        }

        if (num3 > num2) {
            int aux = num3;
            num3 = num2;
            num2 = aux;
        }

        System.out.println("Exibindo os números em ordem decrescente: " + num1 + ", " + num2 + " e " + num3);
    }
}
