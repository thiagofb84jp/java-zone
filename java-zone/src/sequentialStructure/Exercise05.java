package sequentialStructure;

import java.util.Scanner;

public class Exercise05 {
    /**
     * 5. Faça um Programa que converta metros para centímetros.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor (em metros): ");
        double metros = scanner.nextDouble();

        System.out.print(metros + "m equivale a " + centimetros(metros) + "cm.");
    }

    private static double centimetros(double metros) {
        return metros * 100;
    }
}
