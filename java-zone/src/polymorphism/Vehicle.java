package polymorphism;

public class Vehicle {
    /**
     * 2. Write a Java program to create a class Vehicle with a method called speedUp().
     *      Create two subclasses Car and Bicycle. Override the speedUp() method in each
     *          subclass to increase the vehicle's speed differently.
     */
    private int speed;

    public void speedUp() {
        speed += 10;
    }

    public int getSpeed() {
        return speed;
    }
}
