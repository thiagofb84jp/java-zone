package interfaces.flyable;

public class Helicopter implements Flyable {
    @Override
    public void flyObj() {
        System.out.println("Helicopter is flying!");
    }
}
