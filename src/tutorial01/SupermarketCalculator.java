import java.util.Scanner;

public class SupermarketCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the price of Product 1: ");
        double price1 = sc.nextDouble();

        System.out.print("Enter the price of Product 2: ");
        double price2 = sc.nextDouble();

        System.out.println("\n--- Arithmetic Operations ---");
        System.out.println("Total (Sum): " + (price1 + price2));
        System.out.println("Difference: " + Math.abs(price1 - price2));
        System.out.println("Product: " + (price1 * price2));
        System.out.println("Quotient: " + (price1 / price2));
        System.out.println("Remainder: " + (price1 % price2));

        sc.close();
    }
}