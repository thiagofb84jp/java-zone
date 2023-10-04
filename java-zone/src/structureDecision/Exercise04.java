package structureDecision;

import java.util.Scanner;

public class Exercise04 {
    /**
     * 4. Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra (apenas uma): ");
        String letra = scanner.next();

        ehVogalOuConsoante(letra.toLowerCase());
    }

    public static void ehVogalOuConsoante(String letra) {
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") ||
                letra.equals("o") || letra.equals("u")) {
            System.out.println("A letra " + letra + " é uma vogal.");
        } else {
            System.out.println("A letra " + letra + " é uma consoante.");
        }
    }
}
