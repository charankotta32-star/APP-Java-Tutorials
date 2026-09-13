package tutorial05;
import java.util.Scanner;

abstract class Shape { abstract void calculateArea(); }

class Circle extends Shape {
    double r; Circle(double r) { this.r = r; }
    @Override void calculateArea() { System.out.println("Circle Area: " + (3.14159 * r * r)); }
}

class Rectangle extends Shape {
    double l, b; Rectangle(double l, double b) { this.l = l; this.b = b; }
    @Override void calculateArea() { System.out.println("Rectangle Area: " + (l * b)); }
}

public class ShapeAreaQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- GRAPHICS SHAPE AREA ---");
        System.out.print("Enter Circle Radius: ");
        Shape s1 = new Circle(sc.nextDouble());

        System.out.print("Enter Rectangle Length & Breadth: ");
        Shape s2 = new Rectangle(sc.nextDouble(), sc.nextDouble());

        s1.calculateArea();
        s2.calculateArea();
        sc.close();
    }
}