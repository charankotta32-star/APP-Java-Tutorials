package tutorial03;

public class GeometryQ5 {

    // Area of a Square
    public void calculateArea(float side) {
        System.out.println("Area of Square: " + (side * side));
    }

    // Area of a Rectangle
    public void calculateArea(double length, double breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    // Area of a Circle
    public void calculateArea(double radius) {
        System.out.println("Area of Circle: " + (3.14159 * radius * radius));
    }

    public static void main(String[] args) {
        GeometryQ5 geo = new GeometryQ5();

        System.out.println("--- Geometry Area Calculations ---");
        geo.calculateArea(5.0f);        // Calls Square method
        geo.calculateArea(10.0, 4.5);   // Calls Rectangle method
        geo.calculateArea(7.0);         // Calls Circle method
    }
}