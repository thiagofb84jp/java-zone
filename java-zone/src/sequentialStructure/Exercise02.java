package sequentialStructure;

import java.util.Scanner;

public class Exercise02 {
    /**
     * 2. Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int number = scanner.nextInt();

        System.out.println("O número informado foi " + number);
    }
}
