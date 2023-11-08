package objectOrientedProgramming.person;

public class PersonTest {

    public static void main(String[] args) {
        Person person1 = new Person("Mary Louise", 33);
        Person person2 = new Person("Clive Smith", 36);

        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
        System.out.println(person2.getName() + " is " + person2.getAge() + " years old.");

        Person person3 = new Person();
        person3.setName("John Craig");
        person3.setAge(44);

        System.out.println(person3.getName() + " is " + person3.getAge() + " years old.");
    }
}
