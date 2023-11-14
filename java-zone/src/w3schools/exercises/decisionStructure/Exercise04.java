package w3schools.exercises.decisionStructure;

import java.util.Scanner;

public class Exercise04 {
    /**
     * 4. Faça um programa para a leitura de duas notas parciais de um aluno. O programa
     * deve calcular a média alcançada por aluno.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Informe a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media == 10) {
            System.out.println("Aprovado com Distinção!");
        } else if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media < 7) {
            System.out.println("Reprovado!");
        }
    }
}
