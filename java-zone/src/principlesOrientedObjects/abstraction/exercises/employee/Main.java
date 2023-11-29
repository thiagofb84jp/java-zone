package principlesOrientedObjects.abstraction.exercises.employee;

class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("Carlos da Silva Santos", 6000, 1000);
        Employee programmer = new Programmer("Sidney dos Santos Barbosa", 5000, 20, 25.0);

        manager.displayInfo();
        System.out.println("------------------------------------");
        programmer.displayInfo();
    }
}
