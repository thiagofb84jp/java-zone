package w3schools.exercises.decisionStructure;

import java.util.Scanner;

public class Exercise03 {
    /**
     * 3. Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        String letra = scanner.next();

        if (letra.toUpperCase().equals("A") || letra.toUpperCase().equals("E") || letra.toUpperCase().equals("I")
                || letra.toUpperCase().equals("O") || letra.toUpperCase().equals("U")) {
            System.out.println("A letra digitada é uma vogal.");
        } else {
            System.out.println("A letra digitada é uma consoante.");
        }
    }
}
