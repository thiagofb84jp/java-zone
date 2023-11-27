package principlesOrientedObjects.polymorphism;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Carnivores carnivores = new Carnivores();
        carnivores.eat();

        Herbivore herbivore = new Herbivore();
        herbivore.eat();

        Omnivores omnivores = new Omnivores();
        omnivores.eat();
    }
}