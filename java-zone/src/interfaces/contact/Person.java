package interfaces.contact;

public class Person implements Contact {
    private String name;
    private String phone;

    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public TypeContact getType() {
        return TypeContact.PYSICAL_PERSON;
    }
}