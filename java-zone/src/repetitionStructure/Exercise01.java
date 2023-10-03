package repetitionStructure;

import java.util.Scanner;

public class Exercise01 {
    /**
     * 1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido
     * e continue pedindo até que o usuário informe um valor válido.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma nota (entre 0 e 10): ");
        int nota = scanner.nextInt();

        while ((nota < 0) || (nota > 10)) {
            System.out.println("A nota não pode ser menor que zero nem menor que 10.");
            System.out.print("Tente outra vez: ");

            nota = scanner.nextInt();
        }

        System.out.println("A nota informada foi: " + nota);
    }
}