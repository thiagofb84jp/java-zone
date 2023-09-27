package polymorphism;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Cat cat = new Cat();

        animal.makeSound();
        bird.makeSound();
        cat.makeSound();
    }
}