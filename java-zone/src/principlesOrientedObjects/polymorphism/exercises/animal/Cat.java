package principlesOrientedObjects.polymorphism.exercises.animal;

import org.w3c.dom.ls.LSOutput;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows... meows...");
    }
}