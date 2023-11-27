package principlesOrientedObjects.polymorphism;

public class Carnivores extends Animal {
    @Override
    void eat() {
        System.out.println("Carnivores eat meat...");
    }
}
