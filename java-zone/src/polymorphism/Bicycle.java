package polymorphism;

public class Bicycle extends Vehicle {
    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("Bicycle speed increased by 12 units.");
    }
}
