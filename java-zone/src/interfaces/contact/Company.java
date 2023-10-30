package interfaces.contact;

import java.lang.reflect.Type;

public class Company implements Contact {
    private String name;
    private String phone;

    public Company(String name, String phone) {
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
        return TypeContact.LEGAL_PERSON;
    }
}
