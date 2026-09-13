package tutorial05;

abstract class Product {
    int id; String name; double price;
    Product(int i, String n, double p) { id = i; name = n; price = p; }
    abstract double calculateDiscount();
    void displayFinalPrice() {
        System.out.printf("ID: %d | %-12s | Price: ₹%.0f | Final: ₹%.0f\n", id, name, price, price - calculateDiscount());
    }
}

class Electronics extends Product {
    Electronics(int i, String n, double p) { super(i, n, p); }
    @Override double calculateDiscount() { return price * 0.15; } // 15% discount
}

class Clothing extends Product {
    Clothing(int i, String n, double p) { super(i, n, p); }
    @Override double calculateDiscount() { return price * 0.20; } // 20% discount
}

public class ShoppingDiscountQ4 {
    public static void main(String[] args) {
        System.out.println("--- ONLINE SHOPPING DISCOUNTS ---");
        Product p1 = new Electronics(1, "Smartphone", 40000);
        Product p2 = new Clothing(2, "Jacket", 3000);

        p1.displayFinalPrice();
        p2.displayFinalPrice();
    }
}