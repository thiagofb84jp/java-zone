package interfaces.flyable;

public class Airplane implements Flyable {
    @Override
    public void flyObj() {
        System.out.println("Airplane is flying!");
    }
}
