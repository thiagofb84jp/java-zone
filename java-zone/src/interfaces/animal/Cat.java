package interfaces.animal;

public class Cat implements Animal {
    @Override
    public void noise() {
        System.out.println("Cat is meowing!");
    }
}
