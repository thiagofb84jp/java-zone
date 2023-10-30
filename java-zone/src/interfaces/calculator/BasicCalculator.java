package interfaces.calculator;

public class BasicCalculator implements Calculator {

    private int x;
    private int y;

    public BasicCalculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int sum() {
        return x + y;
    }

    @Override
    public int subtraction() {
        return x - y;
    }

    @Override
    public int multiplication() {
        return x * y;
    }

    @Override
    public int division() {
        return x / y;
    }

    @Override
    public double percentage() {
        return 0;
    }
}