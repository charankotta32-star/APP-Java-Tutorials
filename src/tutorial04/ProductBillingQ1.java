package tutorial04;

public class ProductBillingQ1 {
    int id, quantity;
    String name;
    double price;

    // Smart Constructor
    public ProductBillingQ1(int id, String name, double price, int quantity) {
        this.id = id; this.name = name; this.price = price; this.quantity = quantity;
    }

    public static void main(String[] args) {
        // Clean Array Initialization
        ProductBillingQ1[] cart = {
                new ProductBillingQ1(101, "Laptop", 50000, 1),
                new ProductBillingQ1(102, "Mouse", 800, 2),
                new ProductBillingQ1(103, "Keyboard", 1500, 1),
                new ProductBillingQ1(104, "Monitor", 12000, 2),
                new ProductBillingQ1(105, "Cable", 300, 3)
        };

        System.out.println("--- PRODUCT BILLING SYSTEM ---");
        for (ProductBillingQ1 p : cart) {
            double total = p.price * p.quantity;
            // Smart Ternary Operator instead of bulky if-else
            double discount = (total >= 5000) ? (total * 0.10) : (total * 0.05);
            double finalPrice = total - discount;

            System.out.printf("ID: %d | Name: %-10s | Total: ₹%-6.0f | Discount: ₹%-5.0f | Final: ₹%-6.0f\n",
                    p.id, p.name, total, discount, finalPrice);
        }
    }
}