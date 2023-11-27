package principlesOrientedObjects.inheritance;

class Car extends Vehicle {

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setBrand("Ford");
        myCar.setName("Mustang");
        myCar.setYear(2023);
        myCar.honk();

        System.out.println(myCar.getBrand() + " " + myCar.getName() + " " + myCar.getYear());
    }
}
