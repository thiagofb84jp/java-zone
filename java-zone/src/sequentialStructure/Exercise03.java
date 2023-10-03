package sequentialStructure;

import java.util.Scanner;

public class Exercise03 {
    /**
     * 3. Faça um Programa que peça dois números e imprima a soma.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int x = scanner.nextInt();
        System.out.print("Agora o segundo: ");
        int y = scanner.nextInt();

        System.out.println("O resultado da soma entre os dois números informados: " + soma(x, y));
    }

    private static int soma(int x, int y) {
        return x + y;
    }
}
