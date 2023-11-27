package principlesOrientedObjects.polymorphism;

import java.sql.SQLOutput;

public class Omnivores extends Animal {
    @Override
    void eat() {
        System.out.println("Omnivores eat plants and meat...");
    }
}
