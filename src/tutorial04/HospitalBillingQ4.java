package tutorial04;

public class HospitalBillingQ4 {
    String name; double fee;

    public HospitalBillingQ4(String name, double fee) {
        this.name = name; this.fee = fee;
    }

    // Method with arguments for calculation
    void calculateAndDisplayBill(double discountRateHigh, double discountRateLow) {
        double discount = (fee >= 2000) ? (fee * discountRateHigh) : (fee * discountRateLow);
        double finalAmount = fee - discount;

        System.out.printf("Patient: %-8s | Original Fee: ₹%-6.0f | Discount: ₹%-5.0f | Final Amount: ₹%-6.0f\n",
                name, fee, discount, finalAmount);
    }

    public static void main(String[] args) {
        HospitalBillingQ4[] patients = {
                new HospitalBillingQ4("Ravi", 2500),
                new HospitalBillingQ4("Anita", 1500),
                new HospitalBillingQ4("Kiran", 3000),
                new HospitalBillingQ4("Sunil", 1800),
                new HospitalBillingQ4("Pooja", 5000)
        };

        System.out.println("--- HOSPITAL BILLING SYSTEM ---");
        for (HospitalBillingQ4 p : patients) {
            p.calculateAndDisplayBill(0.10, 0.05); // Passing discount rates as arguments
        }
    }
}