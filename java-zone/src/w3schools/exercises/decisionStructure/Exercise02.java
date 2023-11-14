package w3schools.exercises.decisionStructure;

import java.util.Scanner;

public class Exercise02 {
    /**
     * 2. Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a
     * letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a letra do sexo ('M' ou 'F'): ");
        String letra = scanner.next();

        if (letra.toUpperCase().equals("F")) {
            System.out.println("F - Feminino");
        } else if (letra.toUpperCase().equals("M")) {
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo Inválido!");
        }
    }
}