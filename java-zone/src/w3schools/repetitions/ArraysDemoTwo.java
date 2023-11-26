package w3schools.repetitions;

import java.util.Arrays;
import java.util.List;

public class ArraysDemoTwo {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Madza", "Volkswagen"};

        // using 'for' interator
        System.out.println("\nBegining of 'For'");
        for (int i = 0; i < cars.length; i++) {
            System.out.println("[" + i + "] " + cars[i]);
        }
        System.out.println("End of 'For' Loop");

        // using 'foreach' interator
        System.out.println("\nBegining of 'Foreach'");
        for (String car : cars) {
            System.out.println(car);
        }
        System.out.println("End of 'Foreach'");

        // using 'stream' interator
        System.out.println("\nBegining of 'Stream'");
        List<String> itemsHome = Arrays.asList("Sofá", "Cama", "TV", "Notebook", "Clarobox");
        itemsHome.stream().forEach(System.out::println);

        System.out.println("End of 'Stream'");
    }
}
