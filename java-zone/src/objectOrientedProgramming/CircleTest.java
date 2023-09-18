package objectOrientedProgramming;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5);

        System.out.println("Radius of the circle is " + circle.getRadius());
        System.out.println("The area of the circle is " + circle.getArea());
        System.out.println("The circumference of the circle is " + circle.getCircumference());

        circle.setRadius(8);

        System.out.println("\nRadius of the circle is " + circle.getRadius());
        System.out.println("The area of the circle is " + circle.getArea());
        System.out.println("The circumference of the circle is " + circle.getCircumference());
    }
}
