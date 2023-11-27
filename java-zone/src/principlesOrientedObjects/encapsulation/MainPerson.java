package principlesOrientedObjects.encapsulation;

public class MainPerson {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Mary Smith");
        person.setAge(18);

        System.out.println("******************************** Data Information ********************************");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println("******************************** End ********************************");
    }
}
