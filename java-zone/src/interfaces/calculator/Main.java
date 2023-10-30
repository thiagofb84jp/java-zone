package interfaces.calculator;

public class Main {

    public static void main(String[] args) {
        BasicCalculator basicCalc = new BasicCalculator(20, 10);

        System.out.println("Sum: " + basicCalc.sum());
        System.out.println("Subtraction: " + basicCalc.subtraction());
        System.out.println("Multiplication: " + basicCalc.multiplication());
        System.out.println("Division: " + basicCalc.division());
    }
}