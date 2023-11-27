package principlesOrientedObjects.encapsulation;

public class MainArea {

    public static void main(String[] args) {
        Area rectangle = new Area(2, 16);
        rectangle.getArea();

        Area circle = new Area(2, 8);
        circle.getArea();
    }
}
