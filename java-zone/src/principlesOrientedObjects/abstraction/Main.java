package principlesOrientedObjects.abstraction;

public class Main {

    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
        myPig.eat();

        Dog myDog = new Dog();
        myDog.animalSound();
        myDog.sleep();
        myDog.eat();
    }
}
