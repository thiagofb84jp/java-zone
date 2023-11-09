package w3schools.strings;

public class StringsTwo {
    public static void main(String[] args) {
        //Concatenation

        //Using plus(+) operator
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

        String x = "10", y = "20", z;
        System.out.println(z = x + y);

        //Using concat() method
        String firstWorld = "James MC ";
        String lastWorld = "Pheelps";
        System.out.println(firstWorld.concat(lastWorld));

        //Special characters
        String special = "The character \\ is called blackslash.";
        System.out.println(special);
    }
}