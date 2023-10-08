package structureDecision;

import java.util.Scanner;

public class Exercise10 {
    /**
     * 10. Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou
     * V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!"
     * ou "Valor Inválido!", conforme o caso.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual turno você estuda?");
        System.out.print("Digite M-matutino | V-Vespertino | N- Noturno: ");
        String turno = scanner.next();

        if (turno.toUpperCase().equals("M")) {
            System.out.println("Bom Dia!");
        } else if (turno.toUpperCase().equals("V")) {
            System.out.println("Boa Tarde!");
        } else if (turno.toUpperCase().equals("N")) {
            System.out.println("Boa Noite!");
        } else {
            System.out.println("Valor Inválido!");
        }
    }
}
