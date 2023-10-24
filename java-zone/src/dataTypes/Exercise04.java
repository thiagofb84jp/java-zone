package dataTypes;

import java.util.Scanner;

public class Exercise04 {
    /**
     *
     */
    public static void main(String[] args) {
        double minutesYear = 60 * 24 * 365;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");
        double min = scanner.nextDouble();

        long years = (long) (min / minutesYear);
        int days = (int) ((min / 60 / 24) % 365);

        System.out.println(min + " minutes in approximately " + years + " years and " + days + " days.");
    }
}
