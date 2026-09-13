package tutorial05;
import java.util.Scanner;

interface Payment { void makePayment(); }

class UPI implements Payment { public void makePayment() { System.out.println("Processing UPI Payment..."); } }
class CreditCard implements Payment { public void makePayment() { System.out.println("Processing Credit Card Payment..."); } }
class NetBanking implements Payment { public void makePayment() { System.out.println("Processing Net Banking Payment..."); } }

public class PaymentSystemQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- E-COMMERCE PAYMENT ---");
        System.out.println("1. UPI | 2. Credit Card | 3. Net Banking");
        System.out.print("Select method: ");
        int choice = sc.nextInt();

        // Polymorphic reference
        Payment method = switch (choice) {
            case 1 -> new UPI();
            case 2 -> new CreditCard();
            case 3 -> new NetBanking();
            default -> null;
        };

        if (method != null) method.makePayment();
        else System.out.println("Invalid selection.");
        sc.close();
    }
}