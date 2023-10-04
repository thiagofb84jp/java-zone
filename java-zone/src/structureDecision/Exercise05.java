package structureDecision;

import java.util.Scanner;

public class Exercise05 {
    /**
     * 5. Faça um programa para a leitura de duas notas parciais de um aluno.
     * O programa deve calcular a média alcançada por aluno.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextFloat();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextFloat();

        validarSituacaoAluno(nota1, nota2);
    }

    private static void validarSituacaoAluno(double nota1, double nota2) {
        double media = (nota1 + nota2) / 2;

        if (media == 10) {
            System.out.println("Aprovado com Distinção!");
        } else if ((media >= 7) && (media <= 9.9)) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
