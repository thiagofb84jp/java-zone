package objectOrientedProgramming;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Jack Smith", "HR Manager", 40000);
        Employee employee2 = new Employee("Mary Austeen Simpson", "HR Manager", 60000);
        System.out.println("\nEmployee Details: ");
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());

        employee1.raiseSalary(8);
        employee1.raiseSalary(12);

        System.out.println("\nAfter raising salary: ");
        System.out.println("\n8% for " + employee1.getName() + ": ");
        System.out.println(employee1.toString());
        System.out.println("\n12% for " + employee2.getName() + ": ");
        System.out.println(employee2.toString());
    }
}
