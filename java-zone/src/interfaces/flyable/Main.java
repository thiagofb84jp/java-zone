package interfaces.flyable;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Flyable> flyableList = Arrays.asList(new Spacecraft(), new Airplane(), new Helicopter());
        flyableList.forEach(Flyable::flyObj);
    }
}