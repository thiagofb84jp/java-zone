package principlesOrientedObjects.encapsulation;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Jonathan";
        person.age = 40;
        person.identifyNumber = 102030;
        person.cpf = "05682711920";

        System.out.println("******************************** Data Information ********************************");
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.identifyNumber);
        System.out.println(person.cpf);
        System.out.println("******************************** End ********************************");
    }
}
