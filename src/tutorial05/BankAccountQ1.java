package tutorial05;

public class BankAccountQ1 {
    private String accountNumber;
    private String accountHolder;
    private double balance; // Encapsulated (Private)

    public BankAccountQ1(String accNum, String name, double initialBalance) {
        this.accountNumber = accNum;
        this.accountHolder = name;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) { balance += amount; System.out.println("Deposited: ₹" + amount); }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) { balance -= amount; System.out.println("Withdrew: ₹" + amount); }
        else { System.out.println("Insufficient balance!"); }
    }

    public void display() {
        System.out.printf("Acc: %s | Name: %s | Balance: ₹%.2f\n", accountNumber, accountHolder, balance);
    }

    public static void main(String[] args) {
        System.out.println("--- SECURE BANK SYSTEM ---");
        BankAccountQ1 acc = new BankAccountQ1("1001", "Charan", 5000);
        acc.display();
        acc.deposit(2500);
        acc.withdraw(1200);
        acc.display();
    }
}