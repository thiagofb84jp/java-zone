package w3schools.repetitions;

import java.util.Arrays;

public class ArraysDemoOne {
    public static void main(String[] args) {
        // declaring array elements
        String[] cars;
        int[] numbers;
        double[] notes;

        //starting array elements with some values
        String[] pepsiCola = {"Coca-Cola", "Pepsi", "Fanta", "Kwat", "Frevo"};
        int[] naturalNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] racionals = {0.5D, 0.7D, 1.11D, 4.11D};

        System.out.println(pepsiCola[0]);
        System.out.println(pepsiCola[4]);
        System.out.println(Arrays.toString(pepsiCola)); // print the complete array list

        pepsiCola[1] = "Cajuína";
        System.out.println(Arrays.toString(pepsiCola)); // print the complete array list again

        // array length
        String[] books = { "The Da Vinci Code", "The Crime Book", "The Anne Frank's Diary" };
        System.out.println(books.length);

    }
}
