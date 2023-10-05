package structureDecision;

import java.util.Scanner;

public class Exercise08 {
    /***
     * 8. Faça um programa que pergunte o preço de três produtos e informe qual produto você
     *      deve comprar, sabendo que a decisão é sempre pelo mais barato.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do primeiro produto: ");
        double preco1 = scanner.nextDouble();
        System.out.print("Digite o preço do segundo produto: ");
        double preco2 = scanner.nextDouble();
        System.out.print("Digite o preço do terceiro produto: ");
        double preco3 = scanner.nextDouble();

        validarPrecoMaisBarato(preco1, preco2, preco3);
    }

    private static void validarPrecoMaisBarato(double preco1, double preco2, double preco3) {
        if ((preco1 < preco2) && (preco1 < preco3)) {
            System.out.println("Você deve comprar o primeiro produto, pois, este custa R$" + preco1);
        } else if ((preco2 < preco1) && (preco2 < preco3)) {
            System.out.println("Você deve comprar o segundo produto, pois, este custa R$" + preco2);
        } else {
            System.out.println("Você deve comprar o terceiro produto, pois, este custa R$" + preco3);
        }
    }
}
