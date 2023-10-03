package sequentialStructure;

import java.util.Scanner;

public class Exercise04 {
    /**
     * 4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double a = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double b = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double c = scanner.nextDouble();
        System.out.print("Digite a quarta nota: ");
        double d = scanner.nextDouble();

        System.out.println("A médias das notas do aluno foi de: " + average(a, b, c, d));

    }

    private static double average(double a, double b, double c, double d) {
        return (a + b + c + d) / 4;
    }
}
