package structureDecision;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra ('F' ou 'M'): ");
        String sexo = scanner.next();

        retornarSexo(sexo.toUpperCase());
    }

    private static void retornarSexo(String sexo) {
        if (sexo.equals("F")) {
            System.out.print("F - Feminino");
        } else if (sexo.equals("M")) {
            System.out.print("M - Masculino");
        } else {
            System.out.print("Sexo inválido!");
        }
    }
}
