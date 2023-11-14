package w3schools.exercises.decisionStructure;

import java.util.Scanner;

public class Exercise06 {
    /**
     * 6. Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo
     * que a decisão é sempre pelo mais barato.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro produto: ");
        double x = scanner.nextDouble();
        System.out.print("Digite o valor do segundo produto: ");
        double y = scanner.nextDouble();
        System.out.print("Digite o valor do terceiro produto: ");
        double z = scanner.nextDouble();

        if ((x < y) && (x < z)) {
            System.out.println(x + " é o produto de valor mais em conta.");
        } else if ((y < x) && (y < z)) {
            System.out.println(y + " é o produto de valor mais em conta.");
        } else {
            System.out.println(z + " é o produto de valor mais em conta.");
        }
    }
}
