package principlesOrientedObjects.inheritance;

class Car extends Vehicle {

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setName("Mustang");
        myCar.setYear(2023);
        myCar.honk();

        System.out.println(myCar.brand + " " + myCar.getName() + " " + myCar.getYear());
    }
}
