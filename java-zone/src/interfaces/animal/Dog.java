package interfaces.animal;

public class Dog implements Animal {

    @Override
    public void noise() {
        System.out.println("Dog is barking!");
    }
}
