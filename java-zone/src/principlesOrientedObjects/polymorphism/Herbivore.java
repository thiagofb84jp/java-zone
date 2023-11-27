package principlesOrientedObjects.polymorphism;

public class Herbivore extends Animal {
    @Override
    void eat() {
        System.out.println("Herbivores eat plants...");
    }
}