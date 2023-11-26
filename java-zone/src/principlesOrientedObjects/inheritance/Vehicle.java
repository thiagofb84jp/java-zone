package principlesOrientedObjects.inheritance;

class Vehicle {

    private String name;
    protected String brand = "Ford";
    private int year;

    public Vehicle() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
