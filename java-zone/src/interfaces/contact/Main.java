package interfaces.contact;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("James", "+55 83 9 9622-3133");
        System.out.println("Name: " + person.getName());
        System.out.println("Phone: " + person.getName());
        System.out.println("Type person: " + person.getType());

        System.out.println();

        Company company = new Company("ACME Press.", "+55 83 3025-7955");
        System.out.println("Name: " + company.getName());
        System.out.println("Phone: " + company.getName());
        System.out.println("Type person: " + company.getType());
    }
}