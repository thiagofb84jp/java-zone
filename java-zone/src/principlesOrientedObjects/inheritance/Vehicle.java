package principlesOrientedObjects.inheritance;

class Vehicle {

    private String name;
    private String brand;
    private int year;

    public Vehicle() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}
