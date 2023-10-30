package interfaces.flyable;

public class Spacecraft implements Flyable{
    @Override
    public void flyObj() {
        System.out.println("Spacecraft is flying!");
    }
}
