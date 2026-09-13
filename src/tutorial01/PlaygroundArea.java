import java.util.Scanner;

public class PlaygroundArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the playground (in meters): ");
        double length = sc.nextDouble();

        System.out.print("Enter the breadth of the playground (in meters): ");
        double breadth = sc.nextDouble();

        double area = length * breadth;
        System.out.println("\nThe total area of the playground is: " + area + " sq. meters");

        sc.close();
    }
}